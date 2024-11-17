package BusRev;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.*;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		
		BusDAO busdao=new BusDAO();
		busdao.displaybusinfo();
		
		
		
		
		int userinput=1;
		Scanner sc=new Scanner(System.in);
		while(userinput==1) {
			System.out.println("enter number 1 for booking and number 2 for exit");
			 userinput=sc.nextInt();
			 if(userinput==1) {
				 Booking booking=new Booking();
				 if(booking.isAvailable()) {

					 BookingDAO bookingdao=new BookingDAO();
					 bookingdao.addbooking(booking);
					 System.out.println("Your booking is confirmed");
				 }
				 else
				 {
					 System.out.println("Sorry....Bus is full");
				 }
			 }
		}

	}

}
