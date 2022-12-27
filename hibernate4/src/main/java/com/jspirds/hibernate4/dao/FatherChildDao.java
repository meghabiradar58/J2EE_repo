package com.jspirds.hibernate4.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspirds.hibernate4.dto.ChildDto;
import com.jspirds.hibernate4.dto.FatherDto;

public class FatherChildDao {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction transaction;
	private static void OpenConnections()
	{
		entityManagerFactory=Persistence.createEntityManagerFactory("OneToMany");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		
		
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
		if(transaction!=null)
		try {
			transaction.rollback();
		}catch (TransactionException e) {
			System.out.println("Transaction commited");
		}
	
	}
public static void main(String[] args) {
	try {
	OpenConnections();
	transaction.begin();
	FatherDto father1=new FatherDto();
	father1.setId(1);
	father1.setName("parbhat");
	father1.setAge(55);
	
	ChildDto child1=new ChildDto();
	child1.setId(1);
	child1.setName("Mahesh");
	child1.setAge(26);
	entityManager.persist(child1);
	
	ChildDto child2=new ChildDto();
	child2.setId(1);
	child2.setName("Megha");
	child2.setAge(23);
	entityManager.persist(child2);
	List<ChildDto> children=Arrays.asList(child1,child2);
	father1.setChildren(children);
	
	
	entityManager.persist(father1);
	transaction.commit();
	}
	finally {
		CloseConnections();
	}
	
}

}
