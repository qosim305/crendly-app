package common;

import java.io.IOException;

import org.testng.ITestListener;

import utils.utility;



public class listener extends utility implements ITestListener{

	
	public void OnTestFailure() {
		
		getScreenshot();
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
	}

	private void getScreenshot() {
		// TODO Auto-generated method stub
		
	}

	
	


	
}
