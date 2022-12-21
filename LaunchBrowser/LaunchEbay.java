package test1.in;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEbay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.ebay.com/");
		
		String source=d.getPageSource();
		System.out.println(source);
	//	System.out.println(d.getPageSource());
		Thread.sleep(3000);
		d.quit();

	}

}
