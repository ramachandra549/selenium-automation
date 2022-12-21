package test3.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\chand\\SELENIUM\\TestDataNotepad.Properties");
		Properties obj=new Properties();
		obj.load(fis);
		String url=obj.getProperty("URL");
		String userName=obj.getProperty("un");
		String passWord=obj.getProperty("pwd");
		System.out.println(url);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(userName,Keys.TAB,passWord,Keys.ENTER);
		
		
	}

}
