package it.uniroma3.siw.hw1;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity	
public class Docente {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate dataNascita;
	
	private String luogoNascita;
	
	private String partitaIva;
	
	
	//Potrebbe avere senso inserire il cascade poichè posso avere persistenti tutti i corsi del professore  e il merge 
	// perché così si può aggiornare direttamente nel caso di un corso che cambia docente
	@OneToMany(mappedBy = "docente", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Corso> corsiDocente;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public List<Corso> getCorsiDocente() {
		return corsiDocente;
	}

	public void setCorsiDocente(List<Corso> corsiDocente) {
		this.corsiDocente = corsiDocente;
	}
	
	

}
