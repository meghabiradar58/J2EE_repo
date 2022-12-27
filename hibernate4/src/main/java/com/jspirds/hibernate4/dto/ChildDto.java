package com.jspirds.hibernate4.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ChildDto {
	@Id
	private int Id;
	private String Name;
	private int age;

}
