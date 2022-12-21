package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
		d.findElement(By.cssSelector("[placeholder='Search for products, brands and more']")).sendKeys("iphone");
		d.findElement(By.cssSelector(".L0Z3Pu")).click();
		Thread.sleep(2000);
		System.out.println(d.getTitle());
	}

}
