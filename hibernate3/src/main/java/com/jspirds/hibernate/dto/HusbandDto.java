package com.jspirds.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class HusbandDto {
	@Id
	private int Id;
	private String Name;
	private String Email;
	private int age;
	private long Conatact;
	@OneToOne
	private WifeDto wife;
	
}
