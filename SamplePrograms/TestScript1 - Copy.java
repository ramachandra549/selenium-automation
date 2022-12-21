package test1.in;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.cowin.gov.in/");
		
		String url=d.getCurrentUrl();
		String title=d.getTitle();
		System.out.println(title);
		System.out.println(url);
		d.close();
		
		
		

	}

}
