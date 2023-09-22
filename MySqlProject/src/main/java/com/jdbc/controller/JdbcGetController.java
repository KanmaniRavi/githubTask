package com.jdbc.controller;

import java.io.IOException;
import com.jdbc.project.Member;
import com.jdbc.project.db.ConnectionJdbc;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcGetController
 */
@WebServlet("/JdbcGetController")
public class JdbcGetController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JdbcGetController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name = request.getParameter("name");
		String Email = request.getParameter("email");
		String Phone = request.getParameter("phone");
		
		Member member =new Member();
        member.setName(Name);
		member.setEmail(Email );
		member.setPhone(Phone);
		ConnectionJdbc cJdbc = new 	ConnectionJdbc();
		String jdbc = cJdbc.getAll(member);
		response.getWriter().print(jdbc);
	}
	    
	  
	}
			
	


