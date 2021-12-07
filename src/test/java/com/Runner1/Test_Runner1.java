package com.Runner1; //Base class examples 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.BaseClass.Base_Class;



public class Test_Runner1 extends Base_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		//userName.sendKeys("sathyapriya123");
		sendKeysElement(userName,"sathyapriya123");
		
		WebElement passWord = driver.findElement(By.id("password"));
		//passWord.sendKeys("Msvalan200116*");
		sendKeysElement(passWord,"Msvalan200116*");
		WebElement logIn = driver.findElement(By.id("login"));
		//logIn.click();
		clickOnElement(logIn);
	}

	
		
	}		

