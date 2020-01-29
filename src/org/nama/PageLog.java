package org.nama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLog extends Ba {
	
	public PageLog() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtname;
	
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btn;
	
	public WebElement getTxtname() {
		return txtname;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtn() {
		return btn;
	}
	
	
	
	

}
