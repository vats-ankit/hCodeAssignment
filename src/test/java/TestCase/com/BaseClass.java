package TestCase.com;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import Utilities.com.ReadConfiguration;

public class BaseClass 
{
	public static WebDriver driver;
	
	ReadConfiguration rb=new ReadConfiguration();
	String bro=rb.getBrowser();
	String url=rb.getUrl();
	@BeforeClass
	void browserLaunch()
	{
		switch(bro.toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "msedge":
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			driver=null;//
			break;	
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void screenShot() throws Exception  
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File f1=sc.getScreenshotAs(OutputType.FILE);
		File f2=new File("ScreenShot/Screen1.png");
		FileUtils.copyFile(f1, f2);
	}

}
