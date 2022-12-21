package test2.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldCam {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement cam=driver.findElement(By.cssSelector("[alt='Camera search']"));
		
		Actions act=new Actions(driver);
		//act.clickAndHold(cam).perform();
		act.moveToElement(cam).clickAndHold().build().perform();
		
		
		
		
	}

}
