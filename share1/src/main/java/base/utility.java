package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import confugaration.pathConfugaration;

public class utility {
	public static String getTestData(int rowIndex , int colmnIndex) throws IOException {
		
	FileInputStream file = new FileInputStream(pathConfugaration.exelpath);
	
	      Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	;
		String value = sh.getRow(rowIndex).getCell(colmnIndex).getStringCellValue();
	return value;	
	}

	public static void captureScreenshot(WebDriver driver ,String tcID) throws IOException {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File(pathConfugaration.screenshotpath+tcID+"_Image.jpg");
		FileHandler.copy(src, dest);
				
	}
	
public static String readPropertyFileData(String key) throws IOException {
	
Properties prop=new Properties();
FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\kite\\share1\\src\\main\\resources\\credentials\\login.properties");

prop.load(file);

String value = prop.getProperty(key);
System.out.println(".............reading property file...............");
	
	return value;
	
}
	
public static String readPropertyFileDataLogin1(String key) throws IOException {
	
Properties prop=new Properties();
FileInputStream file=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\kite\\share1\\src\\main\\resources\\credentials\\Login1.properties");

prop.load(file);

String value = prop.getProperty(key);
System.out.println(".........reading property file......");
	
	return value;
	
}
	
}
