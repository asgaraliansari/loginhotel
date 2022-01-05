package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends BaseClass1{
	public BookingConfirm() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orid;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement canbo;

	public WebElement getOrid() {
		return orid;
	}

	public WebElement getCanbo() {
		return canbo;
	}
	
	
	public void bookingcon(String va) throws InterruptedException, IOException {

		String att = ToGetAttribute(getOrid(), va);
		UpdateXcel("Sheet1", 1, 18, att);
		System.out.println(att);
		Thread.sleep(3000);
		
		
		ToClick(getCanbo());

		
		
		
		
}
}