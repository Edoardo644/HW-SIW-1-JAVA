package it.uniroma3.siw.hw1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FormazioneMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formazione-unit");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
}
