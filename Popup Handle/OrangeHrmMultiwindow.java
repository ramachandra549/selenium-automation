package test2.in;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmMultiwindow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\chand\\\\\\\\SELENIUM\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[3]/div/a[1]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[3]/div/a[2]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[3]/div/a[3]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-slot']/div[3]/div/a[4]")).click();
	//	String main=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			
			if(id.contains("Youtube"));
			{
				driver.switchTo().window(id);
			}
			
		}
		
		System.out.println(driver.getTitle());
	}

}
