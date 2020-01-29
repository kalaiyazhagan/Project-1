package org.nama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exe extends Ba {
	public static void main(String[] args) {
		getdriver();
		loadurl("http://adactin.com/HotelApp/index.php");
		
		WebElement mail = driver.findElement(By.id("username"));
		fill(mail,"kalaiyazhagan");
		
		WebElement pwd = driver.findElement(By.id("password"));
		fill(pwd,"8220761248");
		
		WebElement btn = driver.findElement(By.id("login"));
		clickbtn(btn);
		
		
		
	}
	

}
