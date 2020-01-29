package org.nama;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ba {

	static WebDriver driver;
	static Select s;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\nama\\s\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void loadurl(String url) {
		driver.get(url);
	}

	public static void fill(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void clickbtn(WebElement element) {
		element.click();
	}

	public static void dd(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByValue(text);
	}

}
