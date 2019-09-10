package com.training.sanity.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.training.pom.CategoriesPOM;

public class CategoryTest extends AdminHomeTests {
	private CategoriesPOM category;;
	//private WebDriver driver;
	//private CategoriesPOM category = new CategoriesPOM(driver);
	@Test(priority =3)
	public void Category_SelectRow() throws InterruptedException{
		category = new CategoriesPOM(driver);
		category.selectrow("dress");
		
		
	}
	@Test(priority =4,dependsOnMethods="Category_SelectRow")
	public void Category_Delete(){
		
		category.deletebtn_click();
		
	}
	@Test(priority=5,dependsOnMethods="Category_Delete")
	public void Category_Delete_Alert(){
		category.handleAlert();
	}
	@Test(priority=6,dependsOnMethods = "Category_Delete_Alert")
	public void Category_Delete_Success() throws InterruptedException{
		category.successmsg();
	}
		
				
	}
	
	


