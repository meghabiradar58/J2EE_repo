package com.jspirds.hibernate2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspirds.hibernate2.dto.studentdto;

public class studentdao {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static void openConnection()
	{
		factory=Persistence.createEntityManagerFactory("student");
		manager=factory.createEntityManager();
	   transaction=manager.getTransaction();
	   
	
	}
	private static void closeConnection()
	{
		if(factory!=null)
		{
			factory.close();
		}
		if(manager!=null)
		{
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println
				("Transaction is committed.");
			}
		}
		
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			studentdto student=new studentdto();
			student.setId(1);
			student.setName("Megha");
			student.setCity("Latur");
			student.setEmail("megha12@gmail.com");
			student.setContact(98074567);
			manager.persist(student);
			
			
			
		} finally {
			// TODO: handle finally clause
			closeConnection();
		}
	}
	

}
