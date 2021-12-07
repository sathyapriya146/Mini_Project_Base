package com.Runner1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;
import com.Pom.Home_Page;

public class Rough extends Base_Class {
public static WebDriver driver;
	
	//Home_Page hp = new Home_Page(driver);
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		driver = getBrowser("chrome");
		url("http://google.com/");

		driver.manage().window().maximize();
		
		WebElement google_Search = driver.findElement(By.name("q"));
		sendKeysElement(google_Search, "adactin hotel");
			
		
		
		//scroll("scrollby", null, "adactin hotel");
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
		sleep(2000);
		
		WebElement adactin = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		clickOnElement(adactin);
}
}
