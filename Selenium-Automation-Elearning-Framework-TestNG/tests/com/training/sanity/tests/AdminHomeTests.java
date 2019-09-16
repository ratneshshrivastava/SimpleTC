package com.training.sanity.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.training.pom.AdminHomePOM;

public class AdminHomeTests extends LoginTests{
	//private WebDriver driver;
	private AdminHomePOM adminhome; 
	@Test(priority=2)
	public void UNF_011() throws InterruptedException{
		
		adminhome= new AdminHomePOM(driver);
		if(menu.equalsIgnoreCase("Categories"))
		{
		adminhome.clickmenu("Categories");
		}
		else if(menu.equalsIgnoreCase("Products")){
			adminhome.clickmenu("Products");
		}
		
	}
	

}
