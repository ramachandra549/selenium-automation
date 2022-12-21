package test3.in;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBrokenLinks {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement elements=links.get(i);
			
			String url=elements.getAttribute("href");
		//we have Special Classes called URL & HttpURLConnection to provide connection 
			
			URL linkss =new URL(url); 
			
			HttpURLConnection http=(HttpURLConnection)linkss.openConnection();
			
			try{Thread.sleep(2000);}catch(Exception e) {}
			
			http.connect();
			int error=http.getResponseCode();	//return type is integer
												//if the response code is >=400 then it is a broken link
			
		//give condition to check broken or not
			if(error>=400)
			{
				System.out.println(url+" --- "+"it is broken link");
			}
			else
				System.out.println(url+" --- "+"it is a valid link");
			
			
		}
		
	}
	
	
}
