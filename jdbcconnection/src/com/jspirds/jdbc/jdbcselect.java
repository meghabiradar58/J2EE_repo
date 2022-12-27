package com.jspirds.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class jdbcselect {
	private static Connection connection ;
	private static Statement statement;
	private static ResultSet resultset ;
	private static Properties properties; 
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				FileReader FileReader = new FileReader("D:\\JWEJE2\\jdbcconnection\\resources"
						+"db_info.properties");
				try {
					connection=DriverManager.getConnection("jdbc:mysql://"+ "localhost:3306/weje2",properties);
					statement=connection.createStatement();
					resultset=statement.executeQuery("select * from student");
					while(resultset.next()) {
						
						System.out.println(resultset.getString(1)+"||" + resultset.getString(2)+"||" +resultset.getString(3));
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					properties.load(FileReader);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(statement!=null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(resultset!=null)
			{
				try {
					resultset.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
