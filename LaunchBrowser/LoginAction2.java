package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAction2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chand\\\\SELENIUM\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
/*		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
*/
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		

	}

}
