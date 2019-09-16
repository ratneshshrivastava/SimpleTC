package com.training.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProductPOM {
	private WebDriver driver;
	ProductSearchPOM prodsearch ;

	public AddProductPOM(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-name1")
	private WebElement Prodname;
	@FindBy(id="input-meta-title1")
	private WebElement Metatag;
	@FindBy(xpath="//form[@id='form-product']/ul/li[2]")
	private WebElement Datatab;
	@FindBy(id="input-model")
	private WebElement Model;
	@FindBy(id="input-price")
	private WebElement prc;
	@FindBy(id="input-quantity")
	private WebElement qty;
	@FindBy(xpath="//form[@id='form-product']/ul/li[3]")
	private WebElement Linktab;
	@FindBy(id="input-category")
	private WebElement catg;
	@FindBy(xpath="//ul[@class='dropdown-menu']/li")
	private List<WebElement> CategoryList;
	@FindBy(xpath="//form[@id='form-product']/ul/li[4]")
	private WebElement Attributetab;
	@FindBy(xpath="//form[@id='form-product']/ul/li[5]")
	private WebElement Optiontab;
	@FindBy(xpath="//form[@id='form-product']/ul/li[6]")
	private WebElement Recurringtab;
	@FindBy(xpath="//form[@id='form-product']/ul/li[7]")
	private WebElement Discounttab;
	@FindBy(xpath="//i[@class='fa fa-plus-circle']")
	private WebElement AddDiscounticon;
	@FindBy(xpath="//select[@name='product_discount[0][quantity]']")
	private WebElement DiscountQty;
	@FindBy(xpath="//select[@name='product_discount[0][price]']")
	private WebElement DiscountPrc;
	//@FindBy(xpath="//i[@class='fa fa-calendar']")  
	@FindBy(xpath="//td[6]/div/span/button/i")
	private WebElement CalendarStartBtn;
	@FindBy(xpath="//div[@class='datepicker-days']/table/tbody/tr/td[@class='day active today']")
	private WebElement CurrentDate;
	@FindBy(xpath="//input[@class='product_discount[0][date_start]']")
	private WebElement StartDate;
	@FindBy(xpath="//input[@class='product_discount[0][date_end]']")
	private WebElement EndDate;
	@FindBy(xpath="//td[5]/div/span/button/i")
	private WebElement CalendarEndBtn;
	@FindBy(xpath="//form[@id='form-product']/ul/li[8]")
	private WebElement Specialtab;
	@FindBy(xpath="//form[@id='form-product']/ul/li[9]")
	private WebElement Imagetab;
	@FindBy(xpath="//form[@id='form-product']/ul/li[10]")
	private WebElement Rewardtab;
	@FindBy(id="input-points")
	private WebElement RewardPts;
	@FindBy(xpath="//form[@id='form-product']/ul/li[11]")
	private WebElement Designtab;
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement Savebtn;
	@FindBy(xpath="//i[@class='fa fa-check-circle']")
	private WebElement successmsg;
	
	
	public void AddProductClick(){
		prodsearch= new ProductSearchPOM(driver);
		
		prodsearch.addProductbtn.click();
		
	}
	public void GeneralDetail(String prdname, String mtag){
		this.Prodname.clear();
		this.Metatag.clear();
		this.Prodname.sendKeys(prdname);
		this.Metatag.sendKeys(mtag);
	}
	public void Datatabclik(){
		this.Datatab.click();
	}
	public void DataDetail(String mdl, String prc,String qty){
		this.Model.clear();
		this.Model.sendKeys(mdl);
		this.prc.clear();
		this.prc.sendKeys(prc);
		this.qty.clear();
		this.qty.sendKeys(qty);
	}
	public void Linksclick(){
		this.Linktab.click();
	}
	public void Category(String cat){
		this.catg.sendKeys(cat);
		
		/*Select sel=new Select(catg);
		sel.selectByValue(cat);*/
		
	}
	public void CategoryList(String cat){
		for (WebElement li : CategoryList){
			if (li.getText().equalsIgnoreCase(cat)){
				li.click();
			}
				
		}
		
	}
	
	public void Tabclick(){
		this.Attributetab.click();
		this.Optiontab.click();
		this.Recurringtab.click();
		this.Discounttab.click();
		this.Specialtab.click();
		this.Imagetab.click();
		this.Rewardtab.click();
		this.Designtab.click();
	}
	public void Tabclick_UNF071(){
		this.Attributetab.click();
		this.Optiontab.click();
		this.Recurringtab.click();
		this.Specialtab.click();
		this.Imagetab.click();
		this.Designtab.click();
	}
	public void DiscountClick(){
		this.Discounttab.click();
	}
	public void DiscountDetail(String DiscQty,String DiscPrc){
		this.AddDiscounticon.click();
		this.DiscountQty.sendKeys(DiscQty);
		this.DiscountPrc.sendKeys(DiscPrc);
		this.CalendarStartBtn.click();
		this.CurrentDate.click();
		this.CalendarEndBtn.click();
		this.CurrentDate.click();
		
		
		
	}
	public void RewardClick(){
		this.Rewardtab.click();
	}
	public void RewardDetail(String RewardPt){
		this.RewardPts.clear();
		this.RewardPts.sendKeys(RewardPt);
	}
	public void Save(){
		this.Savebtn.click();
	}
	public void Success(){
		System.out.println(successmsg.getText());
	}
}
