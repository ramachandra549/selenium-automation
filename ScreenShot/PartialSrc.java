package test1.in;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialSrc 
{
	WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		PartialSrc ps=new PartialSrc();
		ps.launch();
		Thread.sleep(2000);
		ps.search();
		Thread.sleep(2000);
		ps.fetch();
		Thread.sleep(2000);
		ps.close();
	}
	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
	}
	public void search() throws InterruptedException
	{	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.className("InyRMC"));
	}
	public void fetch() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/PartialFlipkart.png");
		FileUtils.copyFile(src, trg);
		Thread.sleep(2000);
	}
	public void close()
	{
		driver.close();
	}
}