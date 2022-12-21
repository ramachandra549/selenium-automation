package test2.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		
		WebElement boxA=driver.findElement(By.name("A"));
		WebElement boxB=driver.findElement(By.name("B"));
		try {Thread.sleep(2000);}catch(Exception e) {}
		Actions act=new Actions(driver);
	//	act.dragAndDrop(boxA, boxB).perform();
		
		act.clickAndHold(boxA).moveToElement(boxB).release().build().perform();
		
		
		
		
//		act.clickAndHold(boxA).perform();
	}
}
