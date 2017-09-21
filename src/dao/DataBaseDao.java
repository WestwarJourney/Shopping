package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DataBaseDao {
	protected Connection conn=null;
	protected Statement stmt=null;
	protected PreparedStatement pstm;
	
	protected void load() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/zhengyangsupermarket","root","mysql");
		stmt=conn.createStatement();
	}
	protected void closeAll() throws SQLException{
		if(stmt!=null){
			stmt.close();
		}
		if(conn!=null){
			conn.close();
		}
	}
	protected List<Question> chaxun() throws ClassNotFoundException, SQLException{
		load();
		List<Question> arrayList=new ArrayList();		
		ResultSet rs=stmt.executeQuery("SELECT * FROM questions;");
		Question que = null;
		while(rs.next()){
			que=new Question();
			que.setId(rs.getString("id"));
			que.setTitle(rs.getString("title"));
			que.setDetailDesc(rs.getString("detaiDese"));
			que.setAnswerCount(rs.getString("answerCount"));
			que.setLastModified(rs.getString("lastmodified"));
			arrayList.add(que);
		}		
		closeAll();		
		return arrayList;
	}
	protected int addAll(String str,Object... obj) throws SQLException, ClassNotFoundException{
		load();		
		pstm=conn.prepareStatement(str);
		for(int i=0;i<obj.length;i++){
			pstm.setObject(i+1, obj[i]);
		}
		int count = pstm.executeUpdate();
		closeAll();		
		return count;
	}

}
