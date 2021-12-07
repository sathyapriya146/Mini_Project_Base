package com.sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.BookingConfirmation;
import com.Pom.BookingPage;
import com.Pom.Login_Page;
import com.Pom.SelectPage;

public class Page_Object_Manager {
	
	WebDriver driver;
//private ClassName objectName;
	
	private Login_Page lin;    //---------> null
	
	private BookingPage bp;   //----------> null
	
	private BookingConfirmation bc; //------> null
	
	private  SelectPage sp;   //------------> null
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getLin() {
		if (lin==null) {
			lin = new Login_Page(driver);
		}
		return lin;
	}

	public BookingPage getBp() {
		if (bp==null) {
			bp = new BookingPage(driver);
		}
		return bp;
	}

	public BookingConfirmation getBc() {
		if (bc==null) {
			bc = new BookingConfirmation(driver);
		}
		return bc;
	}

	public SelectPage getSp() {
		if (sp==null) {
			sp = new SelectPage(driver);
		}
		return sp;
	}

	
	
}
