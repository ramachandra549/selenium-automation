package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement enable=driver.findElement(By.id("loginButton"));
		if (enable.isEnabled()) 
		{
			System.out.println("yes it is");
		}
		else
		{
			System.out.println("no its not");
		}
	}

}
