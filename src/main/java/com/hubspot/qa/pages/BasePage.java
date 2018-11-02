package com.hubspot.qa.pages;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hubspot.qa.util.Constants;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "C:\\QA course\\NaveenSeleniumSession\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		
		return driver;
	
	}
	
	public Properties init_properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sumaf\\workspace\\POMSepSession\\src\\main\\java\\com\\hubspot\\qa\\config\\Config.Properties");
					
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop;
	}
}
