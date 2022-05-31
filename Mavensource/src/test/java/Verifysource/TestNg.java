package Verifysource;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import SourceAuto.Homepage;
import SourceAuto.Loginpage;
import Utils.Utility;

public class TestNg {
	WebDriver driver;
	Loginpage loginpage;
	Homepage homepage;
	int row=1;
	int cell=0;
	
	@Parameters("BrowserName")
	
	@BeforeTest
	public void launchbrowser(String browser) {
		System.out.println(browser);
			if(browser.equals("Chrome"))
			{
				driver=Base.openchromebrowser();
			}
			if(browser.equals("Firefox"))
			{
				driver=Base.openfirefoxbrowser();
			}
			driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		
	}
	
	@BeforeClass
	public void createobjects()
	{
		 homepage=new Homepage(driver);
		 loginpage=new Loginpage(driver);

	}
	@BeforeMethod
	public void verifyloginpage() throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.saucedemo.com/");
		
		String data=Utility.fetchdatafromexcelsheet("Ganesh",row, 0);
		 loginpage.passusername(data);
		 
		 data=Utility.fetchdatafromexcelsheet("Ganesh",row, 1);
		 loginpage.sendpassword(data);
		 
		 loginpage.clickonlogin();
		
			
	
	}
	@Test(priority=0)
	public void selectitem() throws InterruptedException
	{
		Thread.sleep(3000);
		
		homepage.movetoaddcard(driver);

	
		
	}
	@Test()
	public void selectbagpacks() throws InterruptedException
	{
		Thread.sleep(3000);
		 homepage.dropdown(driver);	
		 Thread.sleep(3000);
		 homepage.clickonbackpacks();
		 String  url=driver.getCurrentUrl();
		Assert.fail();
	
	
	}
	@AfterMethod
	public void logoutfrombrowser(ITestResult result) throws InterruptedException, IOException 
	{ 
		if(ITestResult.FAILURE==result.getStatus())
		{
			
			Utility.capturescreenshot(driver,result.getName());
		}
		 homepage.movetothreeline(driver);
		 Thread.sleep(3000);
			
		 homepage.movetologout(driver);
		
	}
	@AfterClass
	public void clearobject()
	{
		 loginpage=null;
		 homepage=null;
		
	}
	@AfterTest()
	public void closebrowser()
	{
		driver.close();
		driver=null;
		System.gc();
		
	}

}
