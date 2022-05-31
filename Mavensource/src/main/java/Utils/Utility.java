package Utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	// captute screen shots of failed testmethods
	
	public static void capturescreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		File resource =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY_HH-mm-ss");
		
		String times=sdf.format(d);
		
		File destinaction=new File(".\\test-output\\Capcturescreenshots\\Test-1001"+"-"+screenshotName+"-"+times+".jpeg");
		
		FileHandler.copy(resource, destinaction);
	}
	public static String fetchdatafromexcelsheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		String data;
		String path=".\\src\\main\\resources\\TestData\\Book1.xlsx";
		
	FileInputStream file= new FileInputStream(path);
	    
	Workbook book=WorkbookFactory.create(file);
	Sheet sheet=book.getSheet("Ganesh");
	Row rows=sheet.getRow(row);
	Cell cells=rows.getCell(cell);
	
	data=cells.getStringCellValue();
	try
	{
		data=cells.getStringCellValue();
	}
	catch(Exception e)
	{
		double value=cells.getNumericCellValue();
		data=Double.toString(value);
	}
	return data;
	     
	     
			
		
	}
}
