package br.com.dadrix.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.dadrix.jpautil.JPAUtil;

public class DaoGeneric<T> {
	
	public void salvar(T entidade) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}

}
