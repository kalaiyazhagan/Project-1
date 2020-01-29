package org.nama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLog4 extends Ba{
	public PageLog4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fir;
	@FindBy(id="last_name")
	private WebElement last;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement cc;
	@FindBy(id="cc_type")
	private WebElement typ;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement click;
	public WebElement getFir() {
		return fir;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getTyp() {
		return typ;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getClick() {
		return click;
	}
	
	
}
