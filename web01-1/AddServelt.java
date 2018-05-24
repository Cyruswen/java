package com.kaikai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServelt extends HttpServlet {
	String name;
	String salary;
	String age;
	String job;
	String node;
	int n=0;
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("Text/html;charset=UTF-8");
			
		    	name    = request.getParameter("name");
		    	salary  = request.getParameter("salary");
                age   = request.getParameter("age");
                job   = request.getParameter("job");
                node = request.getParameter("node");
               
                if(name.isEmpty() || salary.isEmpty() || age.isEmpty() || job.isEmpty()){
                	request.setAttribute("message", "输入信息不能为空");
                	request.getRequestDispatcher("addEmp.jsp").forward(request, response);
                	return;
                }
                Dao dao = new Dao();      
                n = dao.addEmp(name, salary, age, job, node);
                System.out.println(n);
                if(n > 0){
                	response.sendRedirect("list");
                }else if(n == -1){
                	request.setAttribute("message", "插入失败");
                	request.getRequestDispatcher("addEmp.jsp").forward(request, response);
                }
	}
	
}
