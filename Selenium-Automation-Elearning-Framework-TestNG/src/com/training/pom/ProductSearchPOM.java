package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.ScreenShot;

public class ProductSearchPOM {
	private WebDriver driver;
	private ScreenShot screenShot;
	private Select sel;
	
	public ProductSearchPOM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(id="input-name")
	private WebElement prdName;
	@FindBy(id="input-price")
	private WebElement prc;
	@FindBy(id="input-status")
	private WebElement status;
	@FindBy(id="input-model")
	private WebElement model;
	@FindBy(id="input-quantity")
	private WebElement qty;
	@FindBy(id="button-filter")
	private WebElement filter;
	@FindBy(xpath="//i[@class='fa fa-plus']")
	public WebElement addProductbtn;
	
	
	public void filterClick(){
		this.filter.click();
	}
	public void prodName(String prd_Name){
		//this.prdName.clear();
		this.prdName.sendKeys(prd_Name);
	}
	public void prodPrice(String prd_Price){
		//this.prdName.clear();
		this.prc.sendKeys(prd_Price);
	}
	public void prodStatus(String prd_Status){
		//this.prdName.clear();
		//this.status.sendKeys(prd_Status);
		Select sel = new Select(status);
		sel.selectByVisibleText(prd_Status);
		
	}
	public void prodModel(String prd_Model){
		//this.prdName.clear();
		this.model.sendKeys(prd_Model);
	}
	public void prodQty(String prd_Qty){
		//this.prdName.clear();
		this.qty.sendKeys(prd_Qty);
	}
	public void clean(){
		this.prdName.clear();
		statusclean();
		this.model.clear();
		this.prc.clear();
		this.qty.clear();
	}
	public void statusclean(){
		final Select sel = new Select(status);
		sel.selectByIndex(0);
		
	}
	/*public void clickAddProduct(){
		this.addProductbtn.click();
	}*/
	
	
	
	

}
