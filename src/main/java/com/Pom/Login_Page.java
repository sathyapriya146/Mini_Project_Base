package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver ;
	
  @FindBy(id="username")
  private WebElement userName;
  
  @FindBy(id="password")
  private WebElement passWord;
  
  @FindBy(id="login")
  private WebElement logIn;
  
  public Login_Page(WebDriver driver2) {
	  this.driver = driver2;
	PageFactory.initElements(driver,this);
}

public WebElement getUserName() {
	return userName;
}

public WebElement getPassWord() {
	return passWord;
}

public WebElement getLogIn() {
	return logIn;
}
  
 
  
  
  
}
