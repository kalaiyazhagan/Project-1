package org.nama;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 {
	static WebElement dr;
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse\\nama\\s\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.snapdeal.com/");
	dr.findElement(By.id("inputValEnter")).sendKeys("Trimmer");
	Robot ro = new Robot();
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	dr.findElement(By.xpath("//img[@class='product-image wooble']")).click();
	
//	get window id
	String p = dr.getWindowHandle();
	
//	To get all the window id
	Set<String> all = dr.getWindowHandles();
	for(String k:all) {
		if (!p.equals(k)) {
			dr.switchTo().window(k);
			
	dr.findElement(By.xpath("//span[text()='add to cart']")).click();
	
		}
	}
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[text()='View Cart']")).click();
	dr.findElement(By.id("pincode-value")).sendKeys("605107");
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyPress(KeyEvent.VK_ENTER);
	
}
}
