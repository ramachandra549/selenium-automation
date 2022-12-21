package test2.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartDragDropExplicitly {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		Thread.sleep(2000);
		WebElement slide1=driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slide1,60,0).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Clear all']")));
		 
		WebElement slide2=driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[2]"));
		act.dragAndDropBy(slide2,-60,0).perform();
		
		
		
		
		
	}

}
