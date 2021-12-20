package com.Runner2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_Class;
import com.Pom.Login_Page;
import com.Pom2.Dress_Selection_Page;

public class Mini_Project2_Step3 extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");;
	public static Dress_Selection_Page dsp = new Dress_Selection_Page(driver);

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		url("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		implicitlyWait(20, TimeUnit.SECONDS);
		actions("moveToElement", dsp.getGender());
		clickOnElement(dsp.getDress());
		clickOnElement(dsp.getCasualDress());
		actions("moveToElement", dsp.getInStoke());
		clickOnElement(dsp.getAddCart());
		implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElement(dsp.getCheck());
		implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElement(dsp.getAdd());clickOnElement(dsp.getAdd());
		clickOnElement(dsp.getAdd());clickOnElement(dsp.getAdd());
		clickOnElement(dsp.getAdd());
		implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElement(dsp.getProceed());
		implicitlyWait(20, TimeUnit.SECONDS);

//		WebElement text = driver.findElement(By.xpath("//input[@name='email_create']"));
//		sendKeysElement(text, "flowers456@gmail.com");
//
//		WebElement create = driver.findElement(By.id("SubmitCreate"));
//		clickOnElement(create);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebElement mrs = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		clickOnElement(mrs);
//
//		WebElement first_Name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
//		sendKeysElement(first_Name, "seesaw");

		WebElement last_Name = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		sendKeysElement(last_Name, "r");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		sendKeysElement(pass, "priya98765");

//		WebElement date = driver.findElement(By.id("uniform-days"));
//		Select s = new Select(date);
//		s.selectByValue("20");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ad_First = driver.findElement(By.id("firstname"));
		sendKeysElement(ad_First, "priya");

		WebElement ad_Last = driver.findElement(By.id("lastname"));
		sendKeysElement(ad_Last, "T");

		WebElement ad_Company = driver.findElement(By.id("company"));
		sendKeysElement(ad_Company, "Wipro");

		WebElement add1 = driver.findElement(By.id("address1"));
		sendKeysElement(add1, "T.Nagar");

		WebElement city = driver.findElement(By.id("city"));
		sendKeysElement(city, "Chennai");

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));

		dropDown("byValue", state, "4");
		WebElement postal = driver.findElement(By.id("postcode"));
		sendKeysElement(postal, "000000");

		WebElement phone = driver.findElement(By.name("phone"));
		sendKeysElement(phone, "04287-78456");

		WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		sendKeysElement(mobile, "9898989898");

		WebElement address = driver.findElement(By.name("alias"));
		sendKeysElement(address, "salem");

		WebElement register = driver.findElement(By.name("submitAccount"));
		clickOnElement(register);

		WebElement checkOut = driver.findElement(By.name("processAddress"));
		clickOnElement(checkOut);

		WebElement cgv = driver.findElement(By.name("cgv"));
		clickOnElement(cgv);

		WebElement shipping = driver.findElement(By.name("processCarrier"));
		clickOnElement(shipping);

		WebElement bank_Pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		clickOnElement(bank_Pay);

		WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(confirm);
		screenShot("D:\\sathyapriya\\Selenium\\screenshot\\mini.png");

	}
}
