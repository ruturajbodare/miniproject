package jdbc;

import java.sql.SQLException;

public class AppMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       EmployeeDao d=new EmployeeDao();
       System.out.println(d.viewAll());
	}

}
