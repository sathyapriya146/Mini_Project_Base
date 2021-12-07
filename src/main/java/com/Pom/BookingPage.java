package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(xpath = "//option[@value='Melbourne']")
	private WebElement sel_loc;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomno;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datein;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateout;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultroom;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement submit;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement fname;
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lname;
	@FindBy(id = "address")
	private WebElement add;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccnum;
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv_no;
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;
	
	

	public BookingPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSel_loc() {
		return sel_loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdd() {
		return add;
	}
	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}
	public WebElement getBookNow() {
		return book;
	}
}
