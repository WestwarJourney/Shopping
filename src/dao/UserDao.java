package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserDao extends DataBaseDao{
	public List<User> lookUpAll() throws ClassNotFoundException, SQLException{
		load();
		List<User> uList=new ArrayList();
		ResultSet rs=stmt.executeQuery("SELECT * FROM userinfo;");
		User user = null;
		while(rs.next()){
			user=new User();
			user.setUnumber(rs.getInt("unumber"));
			user.setUname(rs.getString("Uname"));
			user.setUpassword(rs.getString("upassword"));
			user.setUphonenumber(rs.getInt("uphonenumber"));
			user.setIntegral(rs.getInt("integral"));
			uList.add(user);
		}		
		closeAll();
		return uList;
	}
	public int addUser(User user) throws ClassNotFoundException, SQLException{
		String str="INSERT INTO userinfo VALUES(NULL,?,?,?,?);";
		return super.addAll(str, user.getUname(),user.getUpassword(),user.getUphonenumber(),user.getIntegral());
	}
	public int getVarByUname(String Uname) throws ClassNotFoundException,SQLException{
		load();
		int count = 0;
		ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM userinfo WHERE uname='"+Uname+"';");
		if (rs.next()) {
			count = rs.getInt(1);
		}
		closeAll();
		return count;
	}
}
