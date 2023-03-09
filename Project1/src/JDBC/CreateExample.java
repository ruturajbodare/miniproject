package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegecourse","root","Ruturaj@123");
		Statement st=con.createStatement();
		String sql="create table empnew(id int,ename varchar(67))";
		st.execute(sql);
		con.close();
		System.out.println("created successfully");


	}

}
