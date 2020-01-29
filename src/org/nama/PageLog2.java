package org.nama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLog2 extends Ba {

	public PageLog2() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(id="location")
		private WebElement loc;
		
		@FindBy(id="hotels")
		private WebElement ho;
		@FindBy(id="room_type")
		private WebElement ro;
		@FindBy(id="room_nos")
		private WebElement no;
		@FindBy(id="datepick_in")
		private WebElement fr;
		@FindBy(id="datepick_out")
		private WebElement to;
		@FindBy(id="adult_room")
		private WebElement ad;
		@FindBy(id="child_room")
		private WebElement cr;
		@FindBy(id="Submit")
		private WebElement sub;
		
		public WebElement getLoc() {
			return loc;
		}
		public WebElement getSub() {
			return sub;
		}
		
		public WebElement getHo() {
			return ho;
		}
		public WebElement getRo() {
			return ro;
		}
		public WebElement getNo() {
			return no;
		}
		public WebElement getFr() {
			return fr;
		}
		public WebElement getTo() {
			return to;
		}
		public WebElement getAd() {
			return ad;
		}
		public WebElement getCr() {
			return cr;
		}
		
	

}
