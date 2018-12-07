package com.hubspot.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesPage extends BasePage {
	
	@FindBy(xpath ="//span[text()='Create deal']")
	WebElement createDealBtn;
	
	@FindBy(id ="uid-ctrl-1")
	WebElement DealName;
	
	@FindBy(id="uid-ctrl-4")
	WebElement AmountDeal;
	
	@FindBy(xpath = "//span[text()='Create']")
	WebElement createDealSecondBtn;
	
	
	
	
	
	public SalesPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewDeal(String Name, String Amount ) {
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(createDealBtn));
		createDealBtn.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(DealName));
		DealName.sendKeys(Name);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(AmountDeal));
		AmountDeal.sendKeys(Amount);
		
		wait.until(ExpectedConditions.elementToBeClickable(createDealSecondBtn));
		createDealSecondBtn.click();

		
		
		
		
	}
	
	
	
	
	
}
