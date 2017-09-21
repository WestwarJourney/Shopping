package 数据库连接;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends BaseDao
{
public void addStudent(int snt,String sub,int ssc) throws SQLException, CloneNotSupportedException, ClassNotFoundException{
    try{
    	getconn();
    	ste=conn.createStatement();
		String sql="INSERT INTO `show` VALUES("+snt+",'"+sub+"',"+ssc+")";
       int connt=ste.executeUpdate(sql);
       
	   if(connt>0){
		   System.out.println("添加成功");   
	   }else{
		   System.out.println("添加失败");
	   }
    }finally{
    	closeAll();
    }
	
	
}
public void updateStudent() throws SQLException, CloneNotSupportedException, ClassNotFoundException{
	try{
	getconn();
	String sql="UPDATE `show` SET no2='二师兄'WHERE no1=1;";
	int xc=ste.executeUpdate(sql);
	}finally{
		closeAll() ;
	}
	
}	
public List<Relust> showStudent() throws ClassNotFoundException, SQLException{
	getconn();
	List<Relust> lis=new ArrayList();
	try{

	ps=conn.prepareStatement("select*from show");
	ste=conn.createStatement();
	rs=ps.executeQuery();
	Relust w;
	while(rs.next()){
		w=new Relust();
		int snt=rs.getInt("no1");
		String sub=rs.getString("no2");
		int scc=rs.getInt("no3");
	w.setNo1(4);
	w.setNo2("杨洋");
	w.setNo3(45);   
	 lis.add(w);
	}
	}finally{
		closeAll();
	
	}return lis;
	
	
	
}
public void deleteStudent(int snt,String sub) throws ClassNotFoundException, SQLException, CloneNotSupportedException{
	try{
	getconn();
	String sql=" DELETE *FROM student WHERE=("+snt+","+sub+")";
	int xc=ste.executeUpdate(sql);
	}finally{
		clone();
	}
	
}
}
