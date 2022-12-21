package test2.in;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllSuggestins {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Nokia");
		List<WebElement>allsuggestions=driver.findElements(By.xpath("//div[@class='wXpsjT']/../../../.."));
		
		for(WebElement suggestion:allsuggestions)
		{
			String sug=suggestion.getText();
			if (sug.contains("mobiles"))
			{
				suggestion.click();
				break;
			}
			
		}
		System.out.println(driver.getTitle());
	//	driver.close();
		
		
		
		
	}

}
