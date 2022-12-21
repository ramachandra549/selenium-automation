package test1.in;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
//		d.get("https://www.flipkart.com/");
//		Thread.sleep(3000);
		d.get("https://www.amazon.com/");
		System.out.println(d.getTitle());
	}

}
