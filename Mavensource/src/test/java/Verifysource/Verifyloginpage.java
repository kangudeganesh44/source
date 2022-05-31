package Verifysource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import SourceAuto.Homepage;
import SourceAuto.Loginpage;

public class Verifyloginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
	
	Loginpage Loginpage=new Loginpage(driver);
	Loginpage.passusername("standard_user");
	Loginpage.sendpassword("secret_sauce");
	Loginpage.clickonlogin();
	
	Homepage homepage=new Homepage(driver);
	driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
	homepage.movetoaddcard(driver);
	String url=driver.getCurrentUrl();
		
	
	homepage.movetothreeline(driver);
	Thread.sleep(3000);

	homepage.movetologout(driver);
	System.out.println("done");

	
	
	///2nd process
     driver.get("https://www.saucedemo.com/");
	
	 Loginpage=new Loginpage(driver);
	Loginpage.passusername("standard_user");
	Loginpage.sendpassword("secret_sauce");
	Loginpage.clickonlogin();
	
	 homepage=new Homepage(driver);
	 Thread.sleep(3000);
	 
	 homepage.dropdown(driver);	
	 Thread.sleep(3000);
	 homepage.clickonbackpacks();
	 String url1=driver.getCurrentUrl();
	 System.out.println(url1);
	 
	 SoftAssert soft=new SoftAssert();
	 soft.assertEquals("https://www.saucedemo.com/inventory.html", url1);
	 System.out.println("for checking");
	 soft.assertAll();
	 
	 Thread.sleep(3000);
	 homepage.movetothreeline(driver);
	 Thread.sleep(3000);
	 homepage.movetologout(driver);
	}

}
