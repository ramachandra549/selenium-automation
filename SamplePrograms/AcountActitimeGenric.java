package test1.in;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcountActitimeGenric 
{
	public static void main(String[] args) throws InterruptedException
	{
		Random r=new Random();
		int ran=r.nextInt(1000);
		String expectedresult="Tiger";
		expectedresult=expectedresult+ran;
		
		AcountActitimeGenric cs=new AcountActitimeGenric();
		cs.launch();
		cs.login();
		Thread.sleep(2000);
		String actualresult =cs.createcustomer(expectedresult);
		if(expectedresult.equals(actualresult))
		{
			System.out.println("TC is Passed");
		}
		else
		{
			System.out.println("TC is Failed");
		}
		cs.close();
	}
	ChromeDriver d;
	
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
	}
	public void login() 
	{
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("keepLoggedInCheckBox")).click();
		d.findElement(By.xpath("//div[text()='Login ']")).click();	
	}
	public String createcustomer(String expectedresult) throws InterruptedException
	{
		Thread.sleep(2000);
		d.findElement(By.cssSelector("#container_tasks")).click();
		d.findElement(By.cssSelector(".title.ellipsis")).click();
		d.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(expectedresult);
		d.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Iam Learning Selenium webdriver with java");
		d.findElement(By.cssSelector("[class='components_button withPlusIcon']")).click();
		Thread.sleep(2000);
		String actualresult=d.findElement(By.cssSelector(".titleEditButtonContainer")).getText();
		return actualresult;
	}
	public void close()
	{
		d.close();
	}
}

