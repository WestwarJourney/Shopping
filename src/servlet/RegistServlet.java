package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.RegistService;

public class RegistServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password2");
		int phoneno=Integer.parseInt(request.getParameter("phoneno"));
		String q1=request.getParameter("q1");
		String q2=request.getParameter("q2");
		String q3=request.getParameter("q3");
		String answer1=request.getParameter("answer1");
		String answer2=request.getParameter("answer2");
		String answer3=request.getParameter("answer3");
		RegistService rs=new RegistService();
		try {
			int re=rs.addUser(uname,password,phoneno,q1,q2,q3,answer1,answer2,answer3);
			if(re>0){
				response.sendRedirect("welcome.jsp");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
