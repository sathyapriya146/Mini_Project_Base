package com.Runner1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.sdp.Page_Object_Manager;

public class Mini_Project_Base_POM  extends Base_Class{
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws IOException {
		url("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		sendKeysElement(pom.getLin().getUserName(), "sathyapriya123");
		sendKeysElement(pom.getLin().getPassWord(), "Msvalan200116*");
		clickOnElement(pom.getLin().getLogIn());
		clickOnElement(pom.getBp().getSel_loc());
		clickOnElement(pom.getBp().getHotel());
		clickOnElement(pom.getBp().getRoomtype());
		dropDown("byValue", pom.getBp().getRoomno(), "2");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sendKeysElement(pom.getBp().getDatein(), "22/12/2021");
		implicitlyWait(20, TimeUnit.SECONDS);
		sendKeysElement(pom.getBp().getDateout(), "25/12/2021");
		implicitlyWait(20, TimeUnit.SECONDS);
		dropDown("byIndex", pom.getBp().getAdultroom(), "1");
		dropDown("byValue", pom.getBp().getChildroom(), "3");
		clickOnElement(pom.getBp().getSubmit());
		clickOnElement(pom.getSp().getRadio_butt());
		clickOnElement(pom.getSp().getSelect());
		sendKeysElement(pom.getBp().getFname(), "sathya");
		sendKeysElement(pom.getBp().getLname(), "T");
		sendKeysElement(pom.getBp().getAdd(), "T.nagar,Chennai-28");
		sendKeysElement(pom.getBp().getCcnum(), "9673826583519473");
		implicitlyWait(20,TimeUnit.SECONDS);
		dropDown("byValue",pom.getBp().getCctype(), "VISA");
		dropDown("byValue", pom.getBp().getMonth(), "6");
		dropDown("byValue",pom.getBp().getYear(), "2022");
		sendKeysElement(pom.getBp().getCvv_no(), "1200");
		clickOnElement(pom.getBp().getBookNow());
		clickOnElement(pom.getBc().getLogout());
		screenShot("D:\\sathyapriya\\Selenium\\screenshot\\minipom1.png");
	}
}

