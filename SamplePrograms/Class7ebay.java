package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7ebay {

	public static void main(String[] args) throws InterruptedException {
		
		Class7ebay ce=new Class7ebay();
		ce.launch();
		ce.search();
	//	ce.result();
	}
	ChromeDriver driver;
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	public void search() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("www.ebay.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();	
	}
	public void result() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("eBay: Electronics, Cars")).click();
	}
	
	
}
