package com.training.pom;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.generics.ScreenShot;

public class AdminHomePOM {
private WebDriver driver; 
private ScreenShot screenShot;
	
	public AdminHomePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement catalog;
	@FindBy(linkText="Categories")
	private WebElement category;
	@FindBy(linkText="Products")
	private WebElement product;
	@FindBy(linkText ="Dashboard")
	private WebElement dashboard;
	@FindBy(linkText = "View more...")                                          
	private WebElement viewmore;
	@FindBy(xpath="//*")
	private List<WebElement> llist;
	
	
	
	public void clickmenu(String Adminmenu) throws InterruptedException{
	Thread.sleep(8000);
		//WebDriverWait wt = new WebDriverWait(this.driver, 100);
		//wt.until(ExpectedConditions.visibilityOfAllElements(llist));
	
	Actions actn = new Actions(this.driver); 
	actn.moveToElement(this.catalog).build().perform();
	//screenShot.captureScreenShot("Catalog_Options");
	if(Adminmenu.equalsIgnoreCase("Categories")){
	actn.click(this.category).build().perform();
	}
	else if(Adminmenu.equalsIgnoreCase("Products")){
		actn.click(this.product).build().perform();
		}
	
	
	
	
	
	//Thread.sleep(8000);
	//screenShot.captureScreenShot("Category_Page");
	
	}
	
	
	
	
	
}
