package test2.in;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById(\"username\").value='admin';");
		jse.executeScript("document.getElementsByName(\"pwd\")[0].value='manager';");
		
		
	}

}
