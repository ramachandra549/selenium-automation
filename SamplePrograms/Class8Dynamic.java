package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8Dynamic {

	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Class8Dynamic cd =new Class8Dynamic();
		cd.launch();
		Thread.sleep(3000);
		cd.search();
		Thread.sleep(3000);
		String product="APPLE iPhone X (Silver, 64 GB)";
		
		String price=cd.result(product);
		Thread.sleep(2000);
		System.out.println(price);
		
		Thread.sleep(2000);
		cd.close();
	}
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	public void search()
	{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphonex");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	public String result(String product) throws InterruptedException
	{
		String result=driver.findElement(By.xpath("//div[text()='"+product+"']/../../div[2]/div[1]/div/div")).getText();
	//	Thread.sleep(2000);
		return result;
	}
	public void close()
	{
		driver.close();
	}
	
}

