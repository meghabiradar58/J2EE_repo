package com.jspirds.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {
	

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://"+
			                                                   "localhost:3306/weje2?"+
					                                            "root", "root", "root");
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select *"+" from student");
			
			while(resultSet.next()) {
				
				System.out.println(resultSet.getInt(1)+"||" + resultSet.getString(2)+"||" +resultSet.getString(3));
			}
			connection.close();
			statement.close();
			resultSet.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
