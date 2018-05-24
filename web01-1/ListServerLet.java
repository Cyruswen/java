package com.kaikai;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListServerLet extends  HttpServlet{
	String name;
	String salary;
	String age;
	String job;
	String node;
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("Text/html;charset=UTF-8");
			
		    	name    = request.getParameter("name");
		    	salary  = request.getParameter("salary");
                age   = request.getParameter("age");
                job   = request.getParameter("job");
                node = request.getParameter("node");
                Dao dao = new Dao();
                ArrayList<Employee> es = dao.findAll();
                request.setAttribute("es", es);
                request.getRequestDispatcher("emplist.jsp").forward(request, response);
                
	}

}
