package it.uniroma3.siw.hw1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity	
public class Società {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String ragioneSociale;
	
	//Quando rendo persistente una società è utile avere subito il suo indirizzo e quindi rimuoverlo in caso di fallimento( o cose simili)
	//della società. Il merge risulta utile nel momento in cui la società cambia indirizzo
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE,CascadeType.MERGE})
	private Indirizzo indirizzo;
	
	private String numeroCell;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumeroCell() {
		return numeroCell;
	}

	public void setNumeroCell(String numeroCell) {
		this.numeroCell = numeroCell;
	}
	
	

}
