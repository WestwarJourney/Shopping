package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

public class YuNameServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/htmlcharset=utf-8");
		String uname=request.getParameter("name");
		String yn=null;
		UserDao ud=new UserDao();
		int i=0;
		try {
			i=ud.getVarByUname(uname);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0){
			yn="unameOK";
		}else{
			yn="unameNotOK";
		}
		if(uname==null||uname.length()<=0){
			yn="nouname";
		}
		PrintWriter out=response.getWriter();
		out.print(yn);
		out.flush();
		out.close();
	}
}
