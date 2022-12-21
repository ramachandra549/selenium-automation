package test1.in;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBrowser {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().fullscreen();
		d.manage().window().minimize();
		d.manage().window().maximize();
		d.manage().window().setPosition(new Point(300,300));
		d.manage().window().setSize(new Dimension(700,500));
		
		d.navigate().to("https://www.amazon.com/");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
		
		d.close();
		d.quit();
	}

}
