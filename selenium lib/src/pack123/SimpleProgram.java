package pack123;


import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SimpleProgram {
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in/");
////driver.navigate().refresh();
////driver.manage().window().maximize();
//
////         //webelement method
////WebElement all=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
////all.click();
////Select s=new Select(all);
//////s.selectByIndex(3);// select by index
////s.selectByValue("search-alias=amazon-devices");
////
////WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
////String result=mobile.getText();
////System.out.println(result);
////if(result.equals("mobile"))
////{
////	System.out.println("correct text print");
////}
////else
////{
////	System.out.println("wrong text print");
////}
////// drop down handle required tag name must be select
//////WebElement all1=driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
//////all1.click();
//////Select s1=new Select(all1);  // unexpected tagname because of i dropdown required select tagname
//////s.selectByIndex(1);
////
////     // capturing screen shoot
//// File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//here we capture on creenshoot
//// File dest=new File("C:\\Users\\DELL\\Desktop\\selenium screenshot//text123.jpg");
//// // create the object of file class and give argument where we have to save the ss
//// // now we have copy that ss then need to cope ss from source to dest so that we use copy method of findhndler class
//// 
//// FileHandler.copy(source, dest);
//// 
//// WebElement order=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[2]"));
//// order.click();
//// 
//// Thread.sleep(1000);
//// 
//// WebElement createnewacc=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
//// String result1=createnewacc.getText(); 
//// System.out.println(result1);
//// createnewacc.click();
// 
//          // performing mouse action
//
//// if we have to perform the action of mouse on the brower the create object of *actions* class
//
//
//// if we have creat the object of action class then perform mouce action wit the help actions class metho
//
// WebElement accandlist=driver.findElement(By.xpath("//span[@class='nav-line-2 ']") );
// 
// WebElement yourorder=driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
// 
// Actions act=new Actions(driver);
// 
//// act.moveToElement(accandlist).moveToElement(myorder).click().build().perform();
//// act.click();// used for left signal click
//// act.doubleClick(); // used for left double click
//// act.moveToElement(accandlist);// these method is used for move the cursal at specific location
//// act.contextClick();// it is used for left click
//// act.build();// it is used for combine tow or more mouse action in a single line
//// act.perform();// it is used for execute the mouse action on the browser
// 
// act.moveToElement(accandlist).moveToElement(yourorder).click().build().perform();
// 
// WebElement createnewacc=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
// createnewacc.click();
// Thread.sleep(3000);
// 
// WebElement fname=driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
// WebElement mobno=driver.findElement(By.xpath("//input[@type='email']"));
// WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
// WebElement reenter=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
// 
// fname.sendKeys("ganesh");
// Thread.sleep(1000);
// mobno.sendKeys("7757836321");
// Thread.sleep(1000);
// password.sendKeys("Ganesh@4216");
// Thread.sleep(1000);
// reenter.sendKeys("Ganesh@4216");
// Thread.sleep(1000);
// 
// WebElement verifymobno=driver.findElement(By.xpath("//input[@id='continue']"));
// String result=verifymobno.getText();
// System.out.println(result);
// if(result.equals("veryfy moble no"))
// {
//	 System.out.println("correct text");
// }
// else
// {
//	 System.out.println("wrong text");
// }
//   //how to perform drop down
//// driver.get("https://demo.guru99.com/test/drag_drop.html");
//// WebElement rupay=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//// WebElement amount=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//// act.dragAndDrop(rupay, amount).build().perform();
// 
// driver.get("https://www.facebook.com/");
// WebElement cna=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
// cna.click();
// Thread.sleep(1000);
// WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
// WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
// WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
// 
// Select s=new Select(day);
// s.selectByIndex(1);
// Select s1=new Select(month);
// s1.selectByIndex(8);
// Select s2=new Select(year);
// s2.selectByVisibleText("1995");
// 
// WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
// boolean result1=custom.isSelected();
// System.out.println(result1);
// custom.click();
// 
//    // how to capture multiple screenshots
// File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
// Date myd=new Date(7);
// String newdate=myd.toString().replace(":","-");
// File dest=new File("C:\\Users\\DELL\\Desktop\\selenium screenshot//homepage"+newdate+".jpg");
// FileHandler.copy(source, dest);

//
//WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//all.click();
//Select s=new Select(all);
//s.selectByIndex(0);
 
// WebElement seeoffer=driver.findElement(By.xpath("(//a[@class='a-link-normal see-more truncate-1line'])[1]"));
// seeoffer.click();
// Thread.sleep(1000);
 
// WebElement hello=driver.findElement(By.xpath("(//a[@data-ux-jq-mouseenter='true'])[1]"));
// Thread.sleep(1000);
// WebElement myorder=driver.findElement(By.xpath("(//span[@class='nav-text'])[7]"));
// Thread.sleep(1000);
// Actions act=new Actions(driver);
// act.moveToElement(hello).moveToElement(myorder).click().build().perform();
//WebElement createnew=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
//createnew.click();
WebElement mob=driver.findElement(By.xpath("//a[text()='Mobiles']"));
mob.click();
Thread.sleep(3000);

WebElement mobiles=driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
Thread.sleep(3000);
WebElement apple=driver.findElement(By.xpath("(//a[text()='Apple'])[3]"));
Thread.sleep(3000);
Actions at=new Actions(driver);
at.moveToElement(mobiles).moveToElement(apple).click().build().perform();

//WebElement apple=driver.findElement(By.xpath("(//a[text()='Apple'])[1]"));
//Actions at=new Actions(driver);
//at.moveToElement(mobiles).moveToElement(apple).click().build().perform();

 
// WebElement kitchen=driver.findElement(By.xpath("(//a[@tabindex='0'])[37]"));
// WebElement orpat=driver.findElement(By.xpath("//a[text()='Orpat']"));
// Actions act=new Actions(driver);
// act.moveToElement(kitchen).moveToElement(orpat).click().build().perform();
 
// WebElement amezon=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]"));
// boolean result=amezon.isEnabled();
// System.out.println(result);


//String path="C:\\Users\\DELL\\Desktop\\ganeshg.xlsx";
//FileInputStream file=new FileInputStream(path);
//Stream value=WorkbookFactory.create(file).getsheet("ganesh").getrow(4).getcell(0).getStringcellvalue();
// 
 
 
 
 
 
 
 
 
 

























	}

}
