package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass1{
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement dDnloc;
	
	@FindBy(id="hotels")
	private WebElement dDnhotel;
	
	@FindBy(id="room_type")
	private WebElement dDnroomtype;
	
	@FindBy(id="room_nos")
	private WebElement dDnroomnos;
	
	@FindBy(id="datepick_in")
	private WebElement txtdate;
	
	@FindBy(id="datepick_out")
	private WebElement txtdate1;
	
	@FindBy(id="adult_room")
	private WebElement dDnadroom;
	
	@FindBy(id="child_room")
	private WebElement dDnchilro;
	
	@FindBy(id="Submit")
	private WebElement dDnsub;

	public WebElement getdDnloc() {
		return dDnloc;
	}

	public void setdDnloc(WebElement dDnloc) {
		this.dDnloc = dDnloc;
	}

	public WebElement getdDnhotel() {
		return dDnhotel;
	}

	public void setdDnhotel(WebElement dDnhotel) {
		this.dDnhotel = dDnhotel;
	}

	public WebElement getdDnroomtype() {
		return dDnroomtype;
	}

	public void setdDnroomtype(WebElement dDnroomtype) {
		this.dDnroomtype = dDnroomtype;
	}

	public WebElement getdDnroomnos() {
		return dDnroomnos;
	}

	public void setdDnroomnos(WebElement dDnroomnos) {
		this.dDnroomnos = dDnroomnos;
	}

	public WebElement getTxtdate() {
		return txtdate;
	}

	public void setTxtdate(WebElement txtdate) {
		this.txtdate = txtdate;
	}

	public WebElement getTxtdate1() {
		return txtdate1;
	}

	public void setTxtdate1(WebElement txtdate1) {
		this.txtdate1 = txtdate1;
	}

	public WebElement getdDnadroom() {
		return dDnadroom;
	}

	public void setdDnadroom(WebElement dDnadroom) {
		this.dDnadroom = dDnadroom;
	}

	public WebElement getdDnchilro() {
		return dDnchilro;
	}

	public void setdDnchilro(WebElement dDnchilro) {
		this.dDnchilro = dDnchilro;
	}

	public WebElement getdDnsub() {
		return dDnsub;
	}

	public void setdDnsub(WebElement dDnsub) {
		this.dDnsub = dDnsub;
	}
	
	
	
	public void searchHotel(String location,String hotel,String roomtype,String roomno,String date,String date11,String adultroom,String childroom) {

		
		ToSelectByText(getdDnloc(), location);
		ToSelectByText(getdDnhotel(), hotel);
		ToSelectByText(getdDnroomtype(), roomtype);
		ToSelectByText(getdDnroomnos(), roomno);
		ToSelectByText(getdDnloc(), location);
		type(getTxtdate(), date);
		type(getTxtdate1(), date11);
		ToSelectByText(getdDnadroom(), adultroom);
		ToSelectByText(getdDnchilro(), childroom);
		ToClick(getdDnsub());
		
}
	
	
}
