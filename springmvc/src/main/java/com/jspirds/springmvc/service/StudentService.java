package com.jspirds.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspirds.springmvc.pojo.StudentPOJO;
import com.jspirds.springmvc.repository.StudentRepository;
@Service
public class StudentService {
@Autowired
 private StudentRepository repository;
	public StudentPOJO login(String username, String password) {
		// TODO Auto-generated method stub
		StudentPOJO pojo=repository.login(username, password);
		return pojo;
	}

}
