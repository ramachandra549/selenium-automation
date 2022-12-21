package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcountCreatInActitime {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("keepLoggedInCheckBox")).click();
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
	//	d.findElement(By.cssSelector("[id='container_tasks']")).click();
		d.findElement(By.cssSelector("#container_tasks")).click();
		d.findElement(By.cssSelector(".title.ellipsis")).click();
		d.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Tiger");
		d.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Iam Learning Selenium webdriver with java");
		d.findElement(By.cssSelector("[class='components_button withPlusIcon']")).click();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.cssSelector("[title='Tiger']")).getText());
	//	String result=d.findElement(By.cssSelector("[title='Ramachandra']")).getText();
	//	System.out.println(result);
		
	}

}
