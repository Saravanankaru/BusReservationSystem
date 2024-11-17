package BusRev;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

import java.util.Date;

public class Booking {
 String passengername;
 int busNo;
 Date date;
 Booking(){
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the passenger name");
	 passengername=sc.next();
	 System.out.println("enter bus number");
	 busNo=sc.nextInt();
	 System.out.println("enter the date dd-mm-yyyy");
	 String dateinput=sc.next();
	 SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	 try {
		date=dateformat.parse(dateinput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 public boolean isAvailable() throws SQLException{
	
	 BusDAO busdao=new BusDAO();
	 BookingDAO bookingdao=new BookingDAO();
	 int capacity =busdao.getcapacity(busNo);
	 int booked=bookingdao.getbookedcount(busNo,date);
	  
	return booked<capacity;
	
	 
 }
}
