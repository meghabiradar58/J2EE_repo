package com.jspirds.jdbccollable.select;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcselect {
	private static Connection connection ;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultset ;
	private static Properties properties=new Properties();
	private static int result;
	private static String driverPath;
	private static String filePath="D:\\JWEJE2\\jdbcconnection2\\resources\\db_info.properties";
	private static FileReader fileReader;
	private static String query;
	public static void main(String[] args) {
		try {
			fileReader=new FileReader(filePath);
			properties.load(fileReader);
			
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
		    query="select * from student";
		    preparedStatement=connection.prepareStatement(query);
		    resultset=preparedStatement.executeQuery();
		    while(resultset.next())
		    {
		    	student student=new student();
		    	student.setId(resultset.getInt(1));
		    	student.setName(resultset.getString(2));
		    	student.setEmail(resultset.getString(3));
		    	System.out.println(student);
		    }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
