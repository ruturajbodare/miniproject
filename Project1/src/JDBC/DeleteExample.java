package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegecourse","root","Ruturaj@123");
        PreparedStatement statement=con.prepareStatement("delete from empnew where id=?");
        statement.setInt(1,12);
        statement.executeUpdate();
        con.close();
        System.out.println("delete successfully");
	}

}
