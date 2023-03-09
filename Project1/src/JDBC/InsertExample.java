package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegecourse","root","Ruturaj@123");
        PreparedStatement statement=con.prepareStatement("insert into empnew values(?,?)");
        statement.setInt(1, 12);
        statement.setString(2, "gayathri");
        statement.executeUpdate();
        con.close();
        System.out.println("insert successfully");

	}

}
