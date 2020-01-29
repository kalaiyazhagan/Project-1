package org.nama;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ba2 extends Run{
	
	public static void fill(WebElement element,String name) {
	element.sendKeys(name);
	}
	public static void clickbtn(WebElement element) {
		element.click();
	}
	public static void dd(WebElement element, String text) {
		Select s = new Select(element);
		List<WebElement> list = s.getOptions();
		for(WebElement x:list) {
			String att = x.getText();
			if (att.equals(text)){
			
				s.selectByVisibleText(text);
				
			}
		}
		
	}
	

}
