package test2.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\chand\\\\\\\\SELENIUM\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("(//table[@class='headerRowTable']/tbody/tr/td)[1]")).click();
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		String msg=driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(msg);
		
		
		
	}
}
