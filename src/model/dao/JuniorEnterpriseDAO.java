package model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.entities.JuniorEnterprise;
import utility.JPAUtil;

public class JuniorEnterpriseDAO {

	public List<JuniorEnterprise> returnAllJEs(){
		List<JuniorEnterprise> juniorEnterprises = new ArrayList<JuniorEnterprise>();
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("SELECT je FROM JuniorEnterprise je", JuniorEnterprise.class);
		juniorEnterprises = query.getResultList();
		entityManager.close();
		return juniorEnterprises;
	}	
}
