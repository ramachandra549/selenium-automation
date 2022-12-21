package test2.in;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindowHandle {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\chand\\\\\\\\SELENIUM\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click();
		String main=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!id.equals(main))
			{
				driver.switchTo().window(id);
			}
		}
		String title=driver.getTitle();
		System.out.println(title);
		
		
//		driver.close();
//		driver.switchTo().window(main);
		String title1=driver.getTitle();
		System.out.println(title1);
		String price=driver.findElement(By.className("CEmiEU")).getText();
		System.out.println(price);
		WebElement iphone=driver.findElement(By.xpath("//img[contains(@alt,'APPLE iPhone X')]"));
		File phone=iphone.getScreenshotAs(OutputType.FILE);
		File fold=new File("./ScreenShot/iphone.png");
		try{FileUtils.copyFile(phone, fold);}catch(IOException e) {}
		
	}
}
