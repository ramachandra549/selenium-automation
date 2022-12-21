package test3.in;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromXL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\chand\\SELENIUM\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row row=sh.getRow(0);
		Cell cel=row.getCell(1);
		String value1=cel.getStringCellValue();
		System.out.println(value1);
		
		String userName=book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String passWord=book.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		
		DataFormatter df=new DataFormatter();
		String number=df.formatCellValue(sh.getRow(4).getCell(1));
		System.out.println(number);
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(value1);
		driver.findElement(By.id("username")).sendKeys(userName,Keys.TAB,passWord,Keys.ENTER);
		
		
		
		
	}
}
