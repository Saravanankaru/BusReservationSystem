package BusRev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnections {
private static  final String url="jdbc:mysql://localhost:3306/busresv";
private static final String username="root";
private static final String password="12345678";
 public static Connection getconnections() throws SQLException{
	return DriverManager.getConnection(url, username, password);
}
	public static void main(String[] args) {
		

	}

}
