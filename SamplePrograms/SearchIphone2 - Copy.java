package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//button[text()='✕']")).click();
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		d.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		String result=d.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(result);
		Thread.sleep(2000);
		d.close();
	}

}
