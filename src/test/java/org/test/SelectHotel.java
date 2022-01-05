package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass1 {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement cont;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}
	
	public void selecthot() {

		ToClick(getRadio());
		ToClick(getCont());
		
	}
}
