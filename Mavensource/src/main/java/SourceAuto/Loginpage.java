package SourceAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy (xpath="(//input[@class='input_error form_input'])[1]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void passusername(String user)
	{
		username.sendKeys(user);
	}
	public void sendpassword(String abc)
	{
		password.sendKeys(abc);
	}
	public void clickonlogin()
	{
		login.click();
	}

}
