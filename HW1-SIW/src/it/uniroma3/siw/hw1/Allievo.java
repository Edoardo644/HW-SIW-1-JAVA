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
public class Allievo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	private String nome;

	private String cognome;

	private LocalDate dataNascita;

	private String luogoNascita;

	private Long numeromatricola;

	private String email;

	@ManyToMany(mappedBy = "allieviCorso"/*, fetch = FetchType.EAGER*/)
	private List<Corso> corsiAllievo;

	// � utile avere subito persistente l'azienda dove lavora l'allievo ed � utile
	// avere il merge nel caso in cui l'allievo cambi
	// societ�
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Societa societa;

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

	public Long getNumeromatricola() {
		return numeromatricola;
	}

	public void setNumeromatricola(Long numeromatricola) {
		this.numeromatricola = numeromatricola;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Corso> getCorsiAllievo() {
		return corsiAllievo;
	}

	public void setCorsiAllievo(List<Corso> corsiAllievo) {
		this.corsiAllievo = corsiAllievo;
	}

	public Societa getSocieta() {
		return societa;
	}

	public void setSocieta(Societa societa) {
		this.societa = societa;
	}

}
