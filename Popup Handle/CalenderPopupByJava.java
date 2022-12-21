package test2.in;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopupByJava {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\chand\\\\\\\\SELENIUM\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		
		Calendar cal=Calendar.getInstance();
		cal.roll(Calendar.DAY_OF_YEAR,2);
		Date currentDate=cal.getTime();
		System.out.println(currentDate);
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		String modify=sdf.format(currentDate);
		System.out.println(modify);
		driver.switchTo().frame(0);
		driver.findElement(By.className("hasDatepicker")).sendKeys(modify,Keys.ESCAPE);
		


	}

}
