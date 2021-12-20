package com.Runner1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.Helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Mini_Project_Property_File extends Base_Class{
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Mini_Project_Logger.class); 
	
	
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		log.info("Browser Launch");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
		log.info("Url Launch Succesfully");
		driver.manage().window().maximize();
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		sendKeysElement(pom.getLin().getUserName(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		sendKeysElement(pom.getLin().getPassWord(), password);
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
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		sendKeysElement(pom.getBp().getFname(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		sendKeysElement(pom.getBp().getLname(), lastname);
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		sendKeysElement(pom.getBp().getAdd(), address);
		String ccnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcnumber();
		sendKeysElement(pom.getBp().getCcnum(),ccnumber);
		implicitlyWait(20,TimeUnit.SECONDS);
		String ccType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCcType();
		dropDown("byValue",pom.getBp().getCctype(), ccType);
		dropDown("byValue", pom.getBp().getMonth(), "6");
		dropDown("byValue",pom.getBp().getYear(), "2022");
		String cvvnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvvnumber();
		sendKeysElement(pom.getBp().getCvv_no(), cvvnumber);
		clickOnElement(pom.getBp().getBookNow());
		clickOnElement(pom.getBc().getLogout());
		screenShot("D:\\sathyapriya\\Selenium\\screenshot\\mini_log.png");
	}
}
