package com.Pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Selection_Page {
	WebDriver driver;
	
@FindBy(xpath="//a[@title='Women']")
private WebElement gender;

@FindBy(xpath="(//a[@title='Dresses'])[2]")
private WebElement dress;

@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_category=9&controller=category'])[3]")
private WebElement casualDress;

@FindBy(xpath="//span[@class='available-now']")
private WebElement inStoke;

@FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
private WebElement addCart;

@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
private WebElement check;

@FindBy(xpath="//i[@class='icon-plus']")
private WebElement add;

@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement proceed;



public Dress_Selection_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	
}

public WebElement getGender() {
	return gender;
}

public WebElement getDress() {
	return dress;
}

public WebElement getCasualDress() {
	return casualDress;
}

public WebElement getInStoke() {
	return inStoke;
}

public WebElement getAddCart() {
	return addCart;
}

public WebElement getCheck() {
	return check;
}

public WebElement getAdd() {
	return add;
}

public WebElement getProceed() {
	return proceed;
}

}
