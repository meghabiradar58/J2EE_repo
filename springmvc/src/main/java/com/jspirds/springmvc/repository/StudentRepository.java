package com.jspirds.springmvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspirds.springmvc.pojo.StudentPOJO;
import com.mysql.cj.Query;
@Repository
public class StudentRepository {
	
	@Autowired
	private StudentPOJO pojo;

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction already committed");
			}
		}
	}
	
	
	
	
	public StudentPOJO login(String username, String password) {
		// TODO Auto-generated method stub
		openConnection();
		transaction.begin();



		transaction.commit();
		closeConnection();
		return pojo;
	}

}
