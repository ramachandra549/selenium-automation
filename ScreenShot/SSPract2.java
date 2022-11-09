package test1.in;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SSPract2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\chand\\\\\\\\SELENIUM\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver;
		driver.get("https://www.amazon.in/");
		File src =ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./ScreenShot/amazonfull.jpeg");
		FileUtils.copyFile(src, trg);
	//	Files.copy(src, trg);
		driver.close();
	}

}
