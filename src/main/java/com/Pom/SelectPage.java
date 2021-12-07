package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_4']")
	private WebElement radio_butt;
	@FindBy(id="continue")
	private WebElement select;
	
	public SelectPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_butt() {
		return radio_butt;
	}

	public WebElement getSelect() {
		return select;
	}
	
	
}