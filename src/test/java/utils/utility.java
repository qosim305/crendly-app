package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import crebdly.base.Base;

public class utility extends Base{

	
	
	public void CaptureScreenshots() throws IOException {

		TakesScreenshot ts =(TakesScreenshot)driver;	
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		
	}
}
