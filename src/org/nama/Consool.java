package org.nama;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Consool {

	static WebElement driver;
	@BeforeClass
	public static void method() {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\nama\\s\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/"); 
		
		Assert.assertTrue(driver.getCurrentUrl().contains("Facebook"));
				
	}
	@Before
	public void method1() {
		System.out.println("1");
		
	}
	@Test
	public void method2() {
		driver.findElement(By.id("email")).sendKeys("kalai");
		
		driver.findElement(By.id("u_0_2")).click();
	System.out.println("2");
	}
	
	@Test
	public void method8() {
		driver.findElement(By.id("email")).sendKeys("kalai");
		
		driver.findElement(By.id("pass")).sendKeys("kls753854");
		}
	
	@Test
	public void method7() {
		driver.findElement(By.id("u_0_2")).click();
	System.out.println("2");
	}
	@Ignore
	@Test
	public void method6() {
		System.out.println("6");
	}
	
	@After
	public void method3() {
		System.out.println("3");
		
	}
	@AfterClass
	public static void method4() {
	System.out.println("finished");	
	
	}
	

}
