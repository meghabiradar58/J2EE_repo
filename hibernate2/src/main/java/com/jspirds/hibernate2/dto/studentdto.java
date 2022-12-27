package com.jspirds.hibernate2.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class studentdto {
	@Id
private int Id;
private String Name;
private String Email;
private String city;
private long contact;

	

}
