package com.jspirds.jdbccollable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;




public class jdbc {
	private static Connection connection ;
	private static CallableStatement CallableStatement;  
	private static ResultSet resultset ;
	private static Properties properties=new Properties();
	private static int result;
	private static FileReader filereader;
	private static String filePath="D:\\JWEJE2\\jdbccollable\\resources\\dn_info.properties";
	private static String query;
	public static void main(String[] args) {
		
		try {
			filereader=new FileReader(filePath);
			properties.load(filereader);
			Class.forName(properties.getProperty("driverPath"));
			connection=DriverManager.getConnection(properties.getProperty("dburl"),properties);
			query="call proc2()";
			CallableStatement=connection.prepareCall(query);
			resultset=CallableStatement.executeQuery();
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+ resultset.getString(2)+" "+ resultset.getString(3));
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
				if(resultset!=null)
				{
					try {
						resultset.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
					if(CallableStatement!=null)
					{
						try {
							CallableStatement.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		}
		
	}
}}
