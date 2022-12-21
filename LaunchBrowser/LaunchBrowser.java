package test1.in;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.ebay.com");
		Thread.sleep(3000);
		d.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(1000);
		d.close();
	
	
	}
}
