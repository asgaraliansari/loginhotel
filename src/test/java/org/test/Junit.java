package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

public class Junit extends BaseClass1{
	
	
	@BeforeClass
	public static void before() {

		LaunchDriver();
		GetUrl("https://adactinhotelapp.com/");
		
		
		
	}
	@Test
	
	public void hello() throws InterruptedException, IOException, AWTException {

		LoginHotel a = new LoginHotel();
		a.login("itsmani08", "maniP@75026");
		
		SearchHotel b = new SearchHotel();
		b.searchHotel("London", "Hotel Creek", "Double", "1 - One", "12/9/2021", "12/10/2021", "1 - One", "1 - One");
		
		SelectHotel c = new SelectHotel();
		c.selecthot();
		
		BookaHotel d = new BookaHotel();
		d.bookHotel("MUNI", "ali", "vizag", "1463098534890160", "VISA", "June", "2022", "123");
		
		BookingConfirm e = new BookingConfirm();
		e.bookingcon("value");
		
		BookItinerary f = new BookItinerary();
		f.bookite(getXcel("Sheet1", 1, 18));
		
		CancelBook r = new CancelBook();
		
		r.cancrlbokk();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
