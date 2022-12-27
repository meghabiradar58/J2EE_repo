package com.jspirds.servletjsp.classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String n=request.getParameter("u-id");
		String l=request.getParameter("uname");
		String e=request.getParameter("uemail");
		String p=request.getParameter("upass");
		String m=request.getParameter("umobile");

	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee2?","root","root");
		PreparedStatement stmt =con.prepareStatement("insert into info values(?,?,?,?,?)");
		stmt.setString(1, n);
		stmt.setString(2, l);
		stmt.setString(3, e);
		stmt.setString(4, p);
		stmt.setString(5, m);
		
		
		int i=stmt.executeUpdate();
		if(i>0) {
			System.out.println("You are successfully registered");
		}
		
		
	} catch(Exception ey) {
		System.out.println(ey);
	}
}

}
