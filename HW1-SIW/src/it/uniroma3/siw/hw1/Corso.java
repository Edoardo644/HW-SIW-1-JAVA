package it.uniroma3.siw.hw1;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity	
public class Corso {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String nome;
	
	private LocalDate datainizio;
	
	private Long DurataMesi;
	
	@ManyToOne
	private Docente docente;
	
	//È utile avere una lista persistente di tutti gli allievi affiliati a un corso direttamente quando inserisco un corso nel DB 
	//poiché non avrebbe molto senso un Corso senza Allievi
	@ManyToMany(cascade = {CascadeType.PERSIST})
	private List<Allievo> allieviCorso;

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

	public LocalDate getDatainizio() {
		return datainizio;
	}

	public void setDatainizio(LocalDate datainizio) {
		this.datainizio = datainizio;
	}

	public Long getDurataMesi() {
		return DurataMesi;
	}

	public void setDurataMesi(Long durataMesi) {
		DurataMesi = durataMesi;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Allievo> getAllieviCorso() {
		return allieviCorso;
	}

	public void setAllieviCorso(List<Allievo> allieviCorso) {
		this.allieviCorso = allieviCorso;
	}
	
	
	
	
}
