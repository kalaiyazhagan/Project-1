package org.nama;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ball {
//
		public static void main(String[] args) {  
		  // to configure driver   
			System.setProperty("webdriver.chrome.driver","D:\\eclipse\\nama\\s\\chromedriver.exe");    
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.facebook.com/"); 
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("kalai");
			driver.findElement(By.id("pass")).sendKeys("kls753854");
				
	
	
	}

}
