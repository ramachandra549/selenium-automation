package test2.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class GoogleSearchKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Clock");
		Actions act=new Actions(driver);
		try {Thread.sleep(5000);}catch(Exception e) {}
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyUp(Keys.CONTROL).sendKeys("Flower").perform();
	
		
		
		
	}

}
