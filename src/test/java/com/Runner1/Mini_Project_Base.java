package com.Runner1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.BaseClass.Base_Class;
import com.Pom.Login_Page;
import com.Pom.BookingConfirmation;
import com.Pom.BookingPage;
import com.Pom.SelectPage;

public class Mini_Project_Base extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static SelectPage sp = new SelectPage(driver);
	public static Login_Page lIn = new Login_Page(driver);
	public static BookingPage bp = new BookingPage(driver);
	public static BookingConfirmation bc = new BookingConfirmation(driver);
	public static void main(String[] args) throws IOException {
		url("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		sendKeysElement(lIn.getUserName(), "sathyapriya123");
		sendKeysElement(lIn.getPassWord(), "Msvalan200116*");
		clickOnElement(lIn.getLogIn());
		clickOnElement(bp.getSel_loc());
		clickOnElement(bp.getHotel());
		clickOnElement(bp.getRoomtype());
		dropDown("byValue", bp.getRoomno(), "2");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sendKeysElement(bp.getDatein(), "22/12/2021");
		implicitlyWait(20, TimeUnit.SECONDS);
		sendKeysElement(bp.getDateout(), "25/12/2021");
		implicitlyWait(20, TimeUnit.SECONDS);
		dropDown("byIndex", bp.getAdultroom(), "1");
		dropDown("byValue", bp.getChildroom(), "3");
		clickOnElement(bp.getSubmit());
		clickOnElement(sp.getRadio_butt());
		clickOnElement(sp.getSelect());
		sendKeysElement(bp.getFname(), "sathya");
		sendKeysElement(bp.getLname(), "T");
		sendKeysElement(bp.getAdd(), "T.nagar,Chennai-28");
		sendKeysElement(bp.getCcnum(), "9673826583519473");
		implicitlyWait(20,TimeUnit.SECONDS);
		dropDown("byValue",bp.getCctype(), "VISA");
		dropDown("byValue", bp.getMonth(), "6");
		dropDown("byValue", bp.getYear(), "2022");
		sendKeysElement(bp.getCvv_no(), "1200");
		clickOnElement(bp.getBookNow());
		clickOnElement(bc.getLogout());
		screenShot("D:\\sathyapriya\\Selenium\\screenshot\\minipom1.png");
	}
}
