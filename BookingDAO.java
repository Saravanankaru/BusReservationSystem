package BusRev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void addbooking(Booking booking) throws SQLException {
		String query ="insert into booking values(?,?,?)";
		
		Connection con=Dbconnections.getconnections();
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,booking.passengername);
		pst.setInt(2,booking.busNo);
		pst.setDate(3,sqldate);
		pst.executeUpdate();
	}

	public int getbookedcount(int busNo, Date date) throws SQLException {
		Connection con=Dbconnections.getconnections();
		String Query="select count(passenger_name)from booking where bus_no=? and travel_date=?";
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, busNo);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setDate(2,sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

}
