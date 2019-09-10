package com.training.pom;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.generics.ScreenShot;

public class CategoriesPOM {
	
	private ScreenShot screenShot;
	private int selectedrows=0;
	private WebDriver driver;
	public CategoriesPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//i[@class='fa fa-trash-o']")
private WebElement deletebtn;
@FindBy(xpath="//input[@type='checkbox']")
private List<WebElement> chkbox;
@FindBy(xpath="//i[@class='fa fa-check-circle']")
private WebElement success;
/*@FindBy(xpath="//div[@class='table-responsive']/table[@class='table table-bordered table-hover']/tbody/tr")
private List<WebElement> totalrow;*/
@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr")
private List<WebElement> totalrow;




public void selectrow(String  deletecategoryname ) throws InterruptedException
{
	
	Thread.sleep(8000);
	
	if (totalrow.size()>0){
		
		
		for (int i=1;i<=totalrow.size();i++)
		{
			String actualcategoryname =	driver.findElement(By.xpath("//div[@class='table-responsive']/table[@class='table table-bordered table-hover']/tbody/tr["+i+"]/td[2]")).getText();
		
			if(deletecategoryname.equalsIgnoreCase(actualcategoryname))
		{
			
			driver.findElement(By.xpath("//tr["+i+"]/td[contains(text(),'"+deletecategoryname+"')]/preceding-sibling::td/input[@type='checkbox']")).click();
			selectedrows= selectedrows+1;
		}
			
			
		}
		Thread.sleep(4000);
		if (selectedrows>0)
		{
		//screenShot.captureScreenShot("Selected Categories for Delete");
		}
		else
		{
			System.out.println("No category found");
			System.exit(0);
		}
		
		
		
		
	}
	else
	{	
	System.out.println("There is no data in table");
	System.exit(0);}
}
public void deletebtn_click(){
	deletebtn.click();
}
public void handleAlert(){
	Alert alt = driver.switchTo().alert();
	alt.accept();
}
public void successmsg() throws InterruptedException{
	Thread.sleep(4000);
	//screenShot.captureScreenShot("Success Message for Deleted Categories");
	System.out.println(success.getText());
	
}
}