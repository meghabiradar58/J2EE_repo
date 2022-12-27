package com.jspirds.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
 
public class WifeDto {
	@Id
	private int Id;
	private String Name;
	private String Email;
	private int age;
	private long Conatact;
	
	
	

}
