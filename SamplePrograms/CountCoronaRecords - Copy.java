package test1.in;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountCoronaRecords {

	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		CountCoronaRecords cc=new CountCoronaRecords();
		cc.launch();
		Thread.sleep(3000);
		String cases="Coronavirus Cases:";
		String coronaCases=cc.totalCases(cases);
		System.out.println(coronaCases);
		Thread.sleep(3000);
		
		String deaths="Deaths:";
		String coronaDeaths=cc.totalDeaths(deaths);
		System.out.println(coronaDeaths);
		Thread.sleep(3000);
		
		String recover="Recovered:";
		String coronaRecovers=cc.totalRecovered(recover);
		System.out.println(coronaRecovers);
		Thread.sleep(3000);
		cc.close();

	}
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		
	}
	public String totalCases(String cases)
	{
		String tc=driver.findElement(By.xpath("//h1[text()='"+cases+"']/../../div[4]/div/span")).getText();
		return tc;
	}
	public String totalDeaths(String deaths)
	{
		String td=driver.findElement(By.xpath("//h1[text()='"+deaths+"']/../../div[6]/div")).getText();
		return td;
	}
	public String totalRecovered(String recover)
	{
		String tr=driver.findElement(By.xpath("//h1[text()='"+recover+"']/../../div[7]/div")).getText();
		return tr;
	}
	public void close()
	{
		driver.close();
	}

}
