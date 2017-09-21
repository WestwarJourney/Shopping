package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

public class Ypassword extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String password1=request.getParameter("password1");
		String password2=request.getParameter("password2");
		String yn=null;
		if(password1.equals(password2)){
			yn="passwordOK";
		}else{
			yn="passwordNotOK";
		}
		response.setContentType("text/htmlcharset=utf-8");
		PrintWriter out=response.getWriter();
		out.print(yn);
		out.flush();
		out.close();
	}
}
