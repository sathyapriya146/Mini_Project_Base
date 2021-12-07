package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	WebDriver driver;
		
	@FindBy(xpath = "(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")
	private WebElement adactin;

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
		public WebElement getAdactin() {
		return adactin;
	}

}
//(//h3[@class='LC20lb MBeuO DKV0Md'])[1]