package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBook extends BaseClass1 {
	public CancelBook() {
PageFactory.initElements(driver, this);	
}

	@FindBy(id="check_all")
	private WebElement clik1;
	
	@FindBy(id="btn_id_503393")
	private WebElement cancelbok;

    @FindBy(id="search_result_error")	
	private WebElement cantxt;
	
	public WebElement getClik1() {
		return clik1;
	}

	public WebElement getCancelbok() {
		return cancelbok;
	}

	public WebElement getCantxt() {
		return cantxt;
	}

	public void cancrlbokk() throws AWTException {

		ToClick(getClik1());
		 
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		 Okayinalert();
		
		

}
	
}
