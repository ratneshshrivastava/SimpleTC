package com.training.sanity.tests;
import com.training.generics.*;
import org.testng.annotations.Test;

import com.training.pom.ProductSearchPOM;

public class ProductSearchTests extends AdminHomeTests {
	private ProductSearchPOM productSearch;
	private ScreenShot screenShot;
	
	@Test(priority=3)
	public void UNF041() throws InterruptedException{
		/*productSearch = new ProductSearchPOM(driver);
		productSearch.clean();
		productSearch.prodName("Blazers");
		productSearch.filterClick();
		Thread.sleep(4000);
		//screenShot.captureScreenShot("ProductName seach result");
		productSearch.clean();
		productSearch.prodPrice("750.00");
		productSearch.filterClick();
		Thread.sleep(4000);
		//screenShot.captureScreenShot("ProductPrice seach result");
		productSearch.clean();
		productSearch.prodModel("TBSM");
		productSearch.filterClick();
		Thread.sleep(4000);
		//screenShot.captureScreenShot("ProductModel seach result");
		productSearch.clean();
		productSearch.prodQty("114");
		productSearch.filterClick();
		Thread.sleep(4000);
		//screenShot.captureScreenShot("ProductQuantity seach result");
		productSearch.clean();
		productSearch.prodStatus("Enabled");
		productSearch.filterClick();
		Thread.sleep(4000);
		//screenShot.captureScreenShot("ProductStatus seach result");
		productSearch.clean();
		//productSearch.clickAddProduct();		
		*/
	}
}
