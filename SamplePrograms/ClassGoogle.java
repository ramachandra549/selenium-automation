package test1.in;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassGoogle {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		ClassGoogle cg=new ClassGoogle();
		cg.launch();
		cg.search();
		cg.result();
	
	}
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}	
	public void search() throws InterruptedException {	
		driver.findElement(By.name("q")).sendKeys("Sachin tendulkar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();	
	}
	public void result() throws InterruptedException
	{
		String expresult=driver.findElement(By.className("yKMVIe")).getText();
		System.out.println(expresult);
		Thread.sleep(2000);	
	}
}
