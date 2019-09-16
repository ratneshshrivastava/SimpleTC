package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddProductPOM;

public class AddProductTests extends ProductSearchTests {
	private AddProductPOM addprd;
	private ScreenShot screenShot;
	
	@Test(priority=4)
	public void UNF042() throws InterruptedException{
		addprd = new AddProductPOM(driver);
		addprd.AddProductClick();
		Thread.sleep(4000);
		addprd.GeneralDetail("Shirt","Shirt for girls");
		//screenShot.captureScreenShot("Add Product General");
		addprd.Datatabclik();
		Thread.sleep(2000);
		addprd.DataDetail("SHG-010","750","50");
		//screenShot.captureScreenShot("Add Product Data");
		addprd.Linksclick();
		Thread.sleep(2000);
		addprd.Category("Shirt");
		Thread.sleep(4000);
		addprd.CategoryList("Shirt");
		//begin steps for test case UNF_071
		/*addprd.DiscountClick();
		Thread.sleep(4000);
		addprd.DiscountDetail("10", "1000");
		addprd.RewardClick();
		Thread.sleep(4000);
		addprd.RewardDetail("200");*/
		// end steps
		
		//screenShot.captureScreenShot("Add Product List");
		addprd.Tabclick();
		addprd.Save();
		Thread.sleep(4000);
		addprd.Success();
		//screenShot.captureScreenShot("Add Product Success");
		
		
	}
	
	
	

}
