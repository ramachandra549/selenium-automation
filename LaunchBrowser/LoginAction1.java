package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAction1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
/*		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.className("initial")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
/*	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("93393521215");
		driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("bahubali");
		
	
*/		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.className("orangehrm-login-button")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		
	}

}
