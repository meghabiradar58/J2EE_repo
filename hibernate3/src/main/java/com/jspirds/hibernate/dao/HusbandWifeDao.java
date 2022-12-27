package com.jspirds.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspirds.hibernate.dto.HusbandDto;
import com.jspirds.hibernate.dto.WifeDto;

public class HusbandWifeDao {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void OpenConnections() {
		
		
			entityManagerFactory=Persistence.createEntityManagerFactory("OneToOne");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();			
		
	}
	private static void CloseConnections()
	{
		if(entityManagerFactory!=null)
		{
			entityManagerFactory.close();
		}
		if(entityManager!=null)
		{
			entityManager.close();
		}
		try {
		entityTransaction.rollback();
		}catch (TransactionException e) {
			System.out.println("Transaction commited");
		}
		
	}
	public static void main(String[] args) {
		try {
			OpenConnections();
			entityTransaction.begin();
			WifeDto wife=new WifeDto();
			wife.setId(2);
			wife.setName("neha");
			wife.setAge(27);
			wife.setConatact(1252635456);
			wife.setEmail("neha21@gmail.com");
			entityManager.persist(wife);
			HusbandDto husband =new HusbandDto();
			husband.setId(2);
			husband.setName("nilesh");
			husband.setAge(28);
			husband.setConatact(896574456);
			husband.setEmail("nilesh@gmail.com");
			entityManager.persist(husband);
			entityTransaction.commit();
			
		} finally {
			// TODO: handle finally clause
			CloseConnections();
		}
	}

}
