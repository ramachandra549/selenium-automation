package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class9Fontcolor {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		try{Thread.sleep(2000);}catch(Exception e) {}
		WebElement font=driver.findElement(By.id("loginButton"));
		String color=font.getCssValue("color");
		font.getAttribute("loginButton");
		
		System.out.println(color);
		System.out.println(font);
		driver.close();
		
	}	
}
