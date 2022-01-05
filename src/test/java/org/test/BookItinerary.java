package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItinerary extends BaseClass1{
public BookItinerary() {
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="order_id_text")
private WebElement ordtxt;

@FindBy(id="search_hotel_id")
private WebElement clk111;

public WebElement getOrdtxt() {
	return ordtxt;
}

public WebElement getClk111() {
	return clk111;
}	
public void bookite(String data23) {


type(getOrdtxt(), data23);
ToClick(getClk111());

}
}
