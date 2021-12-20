package com.Runner1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.sdp.Page_Object_Manager;

public class Mini_Project_Logger extends Base_Class{
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Mini_Project_Logger.class); 

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser Launch");
		url("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		String username =particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 2, 5);
		sendKeysElement(pom.getLin().getUserName(), username);
		String password = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 3, 5);
		sendKeysElement(pom.getLin().getPassWord(), password);
		clickOnElement(pom.getLin().getLogIn());
		clickOnElement(pom.getBp().getSel_loc());
		clickOnElement(pom.getBp().getHotel());
		clickOnElement(pom.getBp().getRoomtype());
		String roomnumber = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 8, 5);
		dropDown("byValue", pom.getBp().getRoomno(),roomnumber);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sendKeysElement(pom.getBp().getDatein(), "22/12/2021");
		implicitlyWait(20, TimeUnit.SECONDS);
		sendKeysElement(pom.getBp().getDateout(), "25/12/2021");
		implicitlyWait(20, TimeUnit.SECONDS);
		String adultroom = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 11, 5);
		dropDown("byIndex", pom.getBp().getAdultroom(),adultroom);
		String childrooms = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 12, 5);
		dropDown("byValue", pom.getBp().getChildroom(),childrooms);
		clickOnElement(pom.getBp().getSubmit());
		clickOnElement(pom.getSp().getRadio_butt());
		clickOnElement(pom.getSp().getSelect());
		String firstname = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 16, 5);
		sendKeysElement(pom.getBp().getFname(), firstname);
		String lastname = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 17, 5);
		sendKeysElement(pom.getBp().getLname(),lastname);
		String address = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 18, 5);
		sendKeysElement(pom.getBp().getAdd(),address);
		//String ccnumber = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 19, 5);
		sendKeysElement(pom.getBp().getCcnum(),"9876 9876 9876 9870");
		implicitlyWait(20,TimeUnit.SECONDS);
		String cctype = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 20, 5);
		dropDown("byValue",pom.getBp().getCctype(),cctype);
		//String ccmonth = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 21, 5);
		dropDown("byValue", pom.getBp().getMonth(),"6");
		//String ccyear = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 22, 5);
		dropDown("byValue",pom.getBp().getYear(),"2022");
		String cvvnumber = particular_Data_From_Excel("D:\\sathyapriya\\Dec_Mini_Project\\target\\Test Case 1.xlsx", 23, 5);
		sendKeysElement(pom.getBp().getCvv_no(),cvvnumber);
		clickOnElement(pom.getBp().getBookNow());
		clickOnElement(pom.getBc().getLogout());
		screenShot("D:\\sathyapriya\\Selenium\\screenshot\\mini_log.png");
	}
}



