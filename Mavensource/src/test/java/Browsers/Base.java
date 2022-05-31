package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openchromebrowser()
	{
		

		System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\Browserssss\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		return driver;
	}
	public static WebDriver openfirefoxbrowser()
	{
	System.setProperty("webdriver.gecko.driver",".\\src\\test\\resources\\Browserssss\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		return driver;
	}


}
