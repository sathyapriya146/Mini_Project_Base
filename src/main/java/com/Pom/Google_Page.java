package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Page {
	WebDriver driver;
	
	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	private WebElement search;
	
	@FindBy(xpath="(//input[@value='Google Search'])[1]")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}

	public Google_Page(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch() {
		return search;
	}
}
