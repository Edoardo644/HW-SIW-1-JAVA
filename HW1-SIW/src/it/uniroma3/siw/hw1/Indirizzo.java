package it.uniroma3.siw.hw1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Ho ipotizzato fosse meglio organizzare l'indirizzo come un altra entità invece che con 5 attributi messi dentro la società
@Entity
public class Indirizzo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String via;
	
	private String numCivico;
	
	private String comune;
	
	private Long CAP;
	
	private String provincia;

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumCivico() {
		return numCivico;
	}

	public void setNumCivico(String numCivico) {
		this.numCivico = numCivico;
	}

	public String getComune() {
		return comune;
	}

	public void setComune(String comune) {
		this.comune = comune;
	}

	public Long getCAP() {
		return CAP;
	}

	public void setCAP(Long cAP) {
		CAP = cAP;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
	

}
