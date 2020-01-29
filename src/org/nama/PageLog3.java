package org.nama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLog3 extends Ba{
	public PageLog3() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement rd;
	@FindBy(id="continue")
	private WebElement con;
	public WebElement getRd() {
		return rd;
	}
	public WebElement getCon() {
		return con;
	}
	

}
