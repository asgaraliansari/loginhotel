package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotel extends BaseClass1 {
	
	public BookaHotel() {
PageFactory.initElements(driver, this);

	}
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cno;
	
	@FindBy(id="cc_type")
	private WebElement ctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement smont;
	
	@FindBy(id="cc_exp_year")
	private WebElement cyear;

   @FindBy(id="cc_cvv")
   private WebElement cvvno;
   
   @FindBy(id="book_now")
	private WebElement clk;

public WebElement getFname() {
	return fname;
}

public void setFname(WebElement fname) {
	this.fname = fname;
}

public WebElement getLname() {
	return lname;
}

public void setLname(WebElement lname) {
	this.lname = lname;
}

public WebElement getAddress() {
	return address;
}

public void setAddress(WebElement address) {
	this.address = address;
}

public WebElement getCno() {
	return cno;
}

public void setCno(WebElement cno) {
	this.cno = cno;
}

public WebElement getCtype() {
	return ctype;
}

public void setCtype(WebElement ctype) {
	this.ctype = ctype;
}

public WebElement getSmont() {
	return smont;
}

public void setSmont(WebElement smont) {
	this.smont = smont;
}

public WebElement getCyear() {
	return cyear;
}

public void setCyear(WebElement cyear) {
	this.cyear = cyear;
}

public WebElement getCvvno() {
	return cvvno;
}

public void setCvvno(WebElement cvvno) {
	this.cvvno = cvvno;
}

public WebElement getClk() {
	return clk;
}

public void setClk(WebElement clk) {
	this.clk = clk;
} 
public void bookHotel(String ffname,String llname,String addres,String cnoo,String ctype,String smon,String syer,String cvno) throws InterruptedException {

	
	type(getFname(), ffname);
	type(getLname(), llname);
  type(getAddress(), addres);
  type(getCno(), cnoo);
  ToSelectByText(getCtype(), ctype);
  ToSelectByText(getSmont(), smon);
  ToSelectByValue(getCyear(), syer);
type(getCvvno(), cvno);
ToClick(getClk());
Thread.sleep(30000);



}
}
