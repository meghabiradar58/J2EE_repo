
package com.jspirds.jdbc.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class jdbc4
	{
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://"+
			                                                   "localhost:3306/weje2?"+
					                                            "user=root & password=root");
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate("delete from student "+" where id=2");
			
			System.out.println(result +"rows(s)updated");
			ResultSet resultSet=statement.executeQuery("select *"+" from student");
			
			while(resultSet.next()) {
				
				System.out.println(resultSet.getString(1)+"||" + resultSet.getString(2)+"||" +resultSet.getString(3));
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





