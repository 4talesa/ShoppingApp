package br.com.dadrix.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = null;
	
	static {
		if (factory == null) {
			factory = Persistence
					.createEntityManagerFactory("shopping-app");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
}
