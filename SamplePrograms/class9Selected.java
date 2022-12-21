package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class9Selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement check=driver.findElement(By.id("keepLoggedInCheckBox"));
		if(check.isSelected())
		{
			System.out.println("it is selected");
		}
		else
		{
			System.out.println("not selected");
			check.click();
			
		}
		
		
	}

}
