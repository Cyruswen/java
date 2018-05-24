package com.kaikai;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistServelt  extends  HttpServlet{
	
	String id;
	String name;
	String pwd;
	String sex;
	Service service = new Service();
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("Text/html;charset=UTF-8");
//		 请求  客户端  向 服务器  发数据 
//		响应    服务器  向客户端  回传数据
		    	id    = request.getParameter("username");
		    	name  = request.getParameter("name");
                pwd   = request.getParameter("pwd");
                sex   = request.getParameter("sex");
                int ret = service.regist(id, name, pwd, sex);
                PrintWriter out = response.getWriter();
                if(ret > 0){
                	request.setAttribute("message", "注册成功");
                	request.getRequestDispatcher("regist.jsp").forward(request, response);
                }else{
                	request.setAttribute("message", "注册失败");
                	request.getRequestDispatcher("regist.jsp").forward(request, response);
                }
                
                
	} 	
}
