package com.jspirds.jdbcconnection.deletemain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdelete {
private static Connection connection ;
private static Statement statement;
private static int result;
public static void main(String[] args) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection=DriverManager.getConnection("jdbc:mysql://"+ "localhost:3306/weje2?", "root", "root");
statement=connection.createStatement();
result=statement.executeUpdate("delete  from student where id=4 ");
System.out.println(result +"row(s) affected");

} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
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
	}
}
}

