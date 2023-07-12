package crebdly.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties td = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver==null) {
		FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\Testdatafile\\testdata.properties");
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\configfile\\config.properties");
		prop.load(fr);
		td.load(fr1);
		
		
		}
	
	     String browsername = "chrome";

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("testURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
@AfterMethod	
public void teardown() {
	
	driver.quit();
}
}



