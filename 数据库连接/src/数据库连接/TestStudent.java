package ���ݿ�����;

import java.sql.SQLException;

public class TestStudent {
public static void main(String[] args)  {
	StudentDao cs=new StudentDao();
		
      try {
		cs.addStudent(3, "��", 20);
		  cs.showStudent();

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}

