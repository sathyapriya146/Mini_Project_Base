package com.Runner2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;

public class Mini_Project2_Step2 extends Base_Class {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		getBrowser("chrome");
		url("http;//automationpractice.com/index.php");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement google = driver.findElement(By.xpath("//input[@type='text']"));
		sendKeysElement(google, "automation practice");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement automation = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		clickOnElement(automation);

		Actions a = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		actions("moveToElement", women);

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		clickOnElement(dresses);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement casual_Dresses = driver.findElement(By
				.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]"));
		clickOnElement(casual_Dresses);

		WebElement in_stoke = driver.findElement(By.xpath("//span[@class='available-now']"));
		actions("moveToElement", women);

		WebElement add_To_Cart = driver
				.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		clickOnElement(add_To_Cart);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement check = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		clickOnElement(check);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		Thread.sleep(1000);
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(proceed);
		proceed.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement text = driver.findElement(By.xpath("//input[@name='email_create']"));
		sendKeysElement(text, "flowser456@gmail.com");

		WebElement create = driver.findElement(By.id("SubmitCreate"));
		clickOnElement(create);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mrs = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		clickOnElement(mrs);

		WebElement first_Name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		sendKeysElement(first_Name, "seesaw");

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
