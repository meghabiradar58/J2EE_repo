package com.jspirds.hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class studentdao {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	private static EntityTransaction entityTransaction;
	private static void OpenConnections()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("student");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		
	}
	private static void CloseConnection() {
		if(entityManagerFactory!=null)
		{
			entityManagerFactory.close();
		}
		if(entityManager!=null)
		{
			entityManager.close();
		}
		try {
			OpenConnections();
			entityTransaction.begin();
			studentdao student=new studentdao();
			//student.setid(1);
			
			
		} finally {
			CloseConnection();
		}
	}
	
	
}
