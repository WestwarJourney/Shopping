package service;

import java.sql.SQLException;

import dao.UserDao;
import entity.User;

public class RegistService {
	UserDao ud=new UserDao();
	User user;
	public int userNameVer(String uname) throws ClassNotFoundException, SQLException{
		int count=ud.getVarByUname(uname);
		return count;
	}
	public int addUser(String uname, String password, int phoneno, String q1, String q2, String q3,
			String answer1, String answer2, String answer3) throws ClassNotFoundException, SQLException {
		user=new User();
		user.setIntegral(0);
		user.setUname(uname);
		user.setUpassword(password);
		user.setUphonenumber(phoneno);
		return ud.addUser(user);
	}
}
