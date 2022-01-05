package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHotel  extends BaseClass1  {
	
	public LoginHotel() {
		
		PageFactory.initElements(driver, this);
		
}

	@FindBy(id="username")
	private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(id="login")
	private WebElement btn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	public void login(String username,String password) {

		type(getTxtuser(), username);
		type(getTxtpass(), password);
		ToClick(getBtn());
		
}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
