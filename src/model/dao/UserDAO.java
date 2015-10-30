package model.dao;

import javax.persistence.EntityManager;

import model.entities.User;
import utility.JPAUtil;

public class UserDAO {
	
	public void saveUser(User user){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
