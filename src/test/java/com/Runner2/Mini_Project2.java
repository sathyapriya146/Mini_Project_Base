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

public class Mini_Project2  extends Base_Class{
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\sathyapriya\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement google = driver.findElement(By.xpath("//input[@type='text']"));
		google.sendKeys("automation practice");

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement automation = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		automation.click();
		
		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		a.moveToElement(women).build().perform();

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		dresses.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement casual_Dresses = driver.findElement(By
				.xpath("(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]"));
		casual_Dresses.click();

		WebElement in_stoke = driver.findElement(By.xpath("//span[@class='available-now']"));
		a.moveToElement(in_stoke).build().perform();
	
		WebElement add_To_Cart = driver
				.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		add_To_Cart.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement check = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		check.click();
		/// html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span
		// (//a[@title='Proceed to checkout'])[2]
		//// a[@class='btn btn-default button button-medium']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		Thread.sleep(1000);
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed.click();
		Thread.sleep(1000);

		WebElement text = driver.findElement(By.xpath("//input[@name='email_create']"));
		text.sendKeys("flows456@gmail.com");

		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mrs = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		mrs.click();

		WebElement first_Name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		first_Name.sendKeys("seesaw");
		
		WebElement last_Name = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		last_Name.sendKeys("r");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("priya98765");
		
//		WebElement date = driver.findElement(By.id("uniform-days"));
//		Select s = new Select(date);
//		s.selectByValue("20");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ad_First = driver.findElement(By.id("firstname"));
		ad_First.sendKeys("priya");
		
		WebElement ad_Last = driver.findElement(By.id("lastname"));
		ad_Last.sendKeys("T");
		
		WebElement ad_Company = driver.findElement(By.id("company"));
		ad_Company.sendKeys("Wipro");
		
		WebElement add1 = driver.findElement(By.id("address1"));
		add1.sendKeys("T.Nagar");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s = new Select(state);
		s.selectByValue("4");
		
		WebElement postal = driver.findElement(By.id("postcode"));
		postal.sendKeys("00000");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("04287-78456");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		mobile.sendKeys("9898989898");
			
		WebElement address = driver.findElement(By.name("alias"));
		address.sendKeys("salem");
		
		WebElement register = driver.findElement(By.name("submitAccount"));
		register.click();
		
		WebElement checkOut = driver.findElement(By.name("processAddress"));
		checkOut.click();
		
		WebElement cgv = driver.findElement(By.name("cgv"));
		cgv.click();
		
		WebElement shipping = driver.findElement(By.name("processCarrier"));
		shipping.click();
		
		WebElement bank_Pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		bank_Pay.click();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		confirm.click();

		TakesScreenshot ts = (TakesScreenshot)driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\sathyapriya\\Selenium\\screenshot\\mini.png");
		FileUtils.copyFile(screen, destination);
	}

}


