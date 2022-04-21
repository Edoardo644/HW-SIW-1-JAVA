package it.uniroma3.siw.hw1.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import it.uniroma3.siw.hw1.Corso;
import it.uniroma3.siw.hw1.Docente;
import it.uniroma3.siw.hw1.Societa;

public class FormazioneMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formazione-unit");
		EntityManager em = emf.createEntityManager();
		
		Societa society = new Societa();
		society.setNumeroCell("+393387654563");
		society.setRagioneSociale("AziendaFormazione1");
		
		Docente docente= new Docente();
		
		docente.setCognome("Merialdo");
		docente.setNome("Paolo");
		docente.setPartitaIva("123");
		
		Corso corso1 = new Corso();
		corso1.setNome("corso1");
		Corso corso2 = new Corso();
		corso2.setNome("corso2");
		docente.getCorsiDocente().add(corso1);
		docente.getCorsiDocente().add(corso2);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(society);
		em.persist(docente);
		tx.commit();

		
		
		em.close();
		
		em = emf.createEntityManager();
		TypedQuery<Docente> selectDocenteQuery=em.createQuery("SELECT d FROM Docente d",Docente.class);
		List<Docente> listaDocente = selectDocenteQuery.getResultList();
		System.out.println("----");
		for(Docente d : listaDocente) {
			
			for(Corso c :d.getCorsiDocente()){
				System.out.println(c.getNome());
			}
			
		}
		
		emf.close();
	}
}
