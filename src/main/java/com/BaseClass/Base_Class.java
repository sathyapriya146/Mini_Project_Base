package com.BaseClass; //Global Files or Utility Files

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;// -----------> null

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverserver.exe");
			driver = new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void sleep(long milliseconds) throws InterruptedException { // ---------->Thread.sleep method
		Thread.sleep(milliseconds);
	}

	public static void implicitlyWait(int value, TimeUnit type) { // -------------> implicit wait method
		driver.manage().timeouts().implicitlyWait(value, type);
	}

	public static void scroll(String type, WebElement element, String value) { // --------->scrolling method
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (type.equalsIgnoreCase("scrollby")) {
			js.executeScript(value);
		} else if (type.equalsIgnoreCase("scrollIntoView")) {
			js.executeScript("arguments[0].scrollIntoView()", element);
		}
	}

	public static void url(String url) { // -----------------> url
		driver.get(url);
	}

	public static void clickOnElement(WebElement element) { // -----------> click method
		element.click();
	}

	public static void sendKeysElement(WebElement element, String value) { // ----------->sendKeys method
		element.sendKeys(value);
	}

	public static void quit() { // ---------->quit method
		driver.quit();
	}

	public static void close() { // -----------> close method
		driver.close();
	}

	public static void dropDown(String type, WebElement element, String value) { // ------> dropDown method
		Select s = new Select(element);
		
		
		if (type.equalsIgnoreCase("byIndex")) {
			int date = Integer.parseInt(value);
			s.selectByIndex(date);
		} 
		
		else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
			
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
	}

	public static void actions(String actionsName, WebElement element) { // -------> actions class method
		Actions a = new Actions(driver); // (Mouse based actions)
		if (actionsName.equalsIgnoreCase("click")) {
			a.click(element).build().perform();
		} else if (actionsName.equalsIgnoreCase("contextCLick")) {
			a.contextClick(element).build().perform();
		} else if (actionsName.equalsIgnoreCase("doubleClick")) {
			a.doubleClick(element).build().perform();
		} else if (actionsName.equalsIgnoreCase("moveToElement")) {
			a.moveToElement(element).build().perform();
		}
	}

	public static void screenShot(String imageLocation) throws IOException { // -----------> screenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(imageLocation);
		FileHandler.copy(source, destination);
	}

	public static String value;

	public static String particular_Data_From_Excel(String path, int row_Index, int cell_Index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);// up casting
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericcellValue = cell.getNumericCellValue();
			int val = (int) numericcellValue;
			value = String.valueOf(val);

		}
		return value;
	}
}
