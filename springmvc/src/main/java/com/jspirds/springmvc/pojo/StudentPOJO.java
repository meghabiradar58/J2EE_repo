package com.jspirds.springmvc.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class StudentPOJO {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	private String Email;
	
	private String City;
	private Long Contact;
	private String uname;
	private String Password;
	
	
	

}
