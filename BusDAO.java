package BusRev;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
	public void displaybusinfo() throws SQLException{
		String Query="select* from bus";
		
		Connection con=Dbconnections.getconnections();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next()) {
			System.out.println("Bus no:"+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.println("Ac:no");
			}
			else
				System.out.println("Ac:yes");
			System.out.println("the capacity is"+rs.getInt(3));
		}
		System.out.println("..............................");
			
	}
public int  getcapacity(int id) throws SQLException {
	Connection con=Dbconnections.getconnections();
	String Query="select capacity from bus where id="+id;
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery(Query);
	rs.next();
	return rs.getInt(1);
}
	public static void main(String[] args) {
		

	}

}
