package test2.in;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramePopoUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100);");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//font[text()='Free Mock Tests']")).click();
		Thread.sleep(3000);
		
		String main=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(id.equals(main)))
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("(//a[text()='Railways'])[1]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'RRB NTPC')])[1]")).click();
		System.out.println(driver.getTitle());
		
		
		
	}
}
