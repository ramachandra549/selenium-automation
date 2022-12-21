package test2.in;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
		
		
	}
}
