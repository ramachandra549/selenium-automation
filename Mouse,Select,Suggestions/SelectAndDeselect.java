package test2.in;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/chand/SELENIUM/Single%20dropDown.html");
		WebElement dropdown=driver.findElement(By.id("States"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Bihar");
		s.selectByVisibleText("Odissa");
		s.selectByVisibleText("Kerala");
		
		try {Thread.sleep(3000);}catch(Exception e) {}
		s.deselectByVisibleText("Kerala");
		try {Thread.sleep(3000);}catch(Exception e) {}
		s.deselectAll();
		
		List<WebElement> printall=s.getOptions();
		for(WebElement print:printall)
		{
			System.out.println(print.getText());
		}
		
	}

}
