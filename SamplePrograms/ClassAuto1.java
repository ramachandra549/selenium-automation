package test1.in;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassAuto1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.youtube.com/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.manage().window().setPosition(new Point(300,600));
		Thread.sleep(2000);
		dr.manage().window().setSize(new Dimension(400,400));
		Thread.sleep(2000);
		dr.manage().window().minimize();
		Thread.sleep(2000);
		dr.manage().window().fullscreen();
		Thread.sleep(2000);
		dr.close();

		
	}
}
