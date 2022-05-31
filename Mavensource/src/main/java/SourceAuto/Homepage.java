package SourceAuto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement Addtocard;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement threeline;
	
	@FindBy(xpath="(//a[@tabindex='0'])[3]")
	private WebElement logout;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[2]")
	private WebElement backpacks;
	
	public Homepage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void movetoaddcard(WebDriver driver)
	{
		Actions act=new Actions (driver);
		act.moveToElement(Addtocard).click().build().perform();		
	}
	public void movetothreeline(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(threeline).click().build().perform();
	}
	public void movetologout(WebDriver driver)
	{
		Actions act=new Actions (driver);
		act.moveToElement(logout).click().build().perform();

	}
	public void dropdown(WebDriver driver)
	{
		Select s=new Select(dropdown);
		s.selectByValue("hilo");
	}
	public void clickonbackpacks()
	{
		backpacks.click();
	}
	public void scrooldown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,2000)");
	}

}
