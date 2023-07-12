package Testcase;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crebdly.base.Base;

public class Settings extends Base {
	@Test
	public void VerifyuserSetting() throws InterruptedException {

		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys("qosim305@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Actions action = new Actions(driver);
		action.moveToElement(loginbtn).click().perform();
		Thread.sleep(10000);
		WebElement settings = driver.findElement(By.xpath("//p[normalize-space()='Settings']"));
		Actions act = new Actions(driver);
		act.moveToElement(settings).click().perform();
		String actualmessage = driver.findElement(By.xpath("//p[@class='page-title']")).getText();
		Assert.assertEquals(actualmessage, "Settings");
	}

	@Test
	public void VerifyUserCanEditMyAccountFunction() throws InterruptedException {

		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys("qosim305@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Actions action = new Actions(driver);
		action.moveToElement(loginbtn).click().perform();
		Thread.sleep(10000);
		WebElement settings = driver.findElement(By.xpath("//p[normalize-space()='Settings']"));
		Actions act = new Actions(driver);
		act.moveToElement(settings).click().perform();
		WebElement myaccount = driver.findElement(By.xpath("//p[normalize-space()='My Account']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(myaccount).click().perform();
		String actualsettingsMsg = driver.findElement(By.xpath("//span[@class='sc-bBHxTw bwYUmI']")).getText();
		Assert.assertEquals(actualsettingsMsg, "Make changes to account information and settings");

	}

	@Test
	public void VerifyUserCanEditNOKFunction() throws InterruptedException {

		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys("qosim305@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='4']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
		WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Actions action = new Actions(driver);
		action.moveToElement(loginbtn).click().perform();
		Thread.sleep(10000);
		WebElement settings = driver.findElement(By.xpath("//p[normalize-space()='Settings']"));
		Actions act = new Actions(driver);
		act.moveToElement(settings).click().perform();
		WebElement myaccount = driver.findElement(By.xpath("//p[normalize-space()='My Account']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(myaccount).click().perform();
		driver.findElement(By.xpath("//p[normalize-space()='Next of Kin']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter first name']")).sendKeys("kazeem");
		driver.findElement(By.xpath("//input[@placeholder='Enter last name']")).sendKeys("Bolaji");
		WebElement gender = driver.findElement(By.xpath("//select[@name='gender']"));
		Select select = new Select(gender);
		select.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@name='dateOfBirth']")).sendKeys("26/04/1992");
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone no']")).sendKeys("07539286153");
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("qosim305@gmail.com");
		WebElement relationship = driver.findElement(By.xpath("//select[@name='relationship']"));
		Select select1 = new Select(relationship);
		select1.selectByVisibleText("Mother");
		driver.findElement(By.xpath("//input[@placeholder='Enter residence no.']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@placeholder='Enter apartment no.']")).sendKeys("37");
		driver.findElement(By.xpath("//input[@placeholder='Street name']")).sendKeys("Romney street");
		driver.findElement(By.xpath("//select[@name='landMark']")).sendKeys("Moston");
		WebElement landmark = driver.findElement(By.xpath("//select[@name='landMark']"));
		Select select2 = new Select(landmark);
		select2.selectByVisibleText("Apapa");
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select select3 = new Select(state);
		select3.selectByVisibleText("Lagos");
		Thread.sleep(5000);
		WebElement LGA = driver.findElement(By.xpath("//select[@name='lga']"));
		Select select4 = new Select(LGA);
		select4.selectByVisibleText("Lagos-Mainland");
		
	}

@Test
	public void VerifyUsercanGetInTouch() throws InterruptedException {
	WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
	login.sendKeys("qosim305@gmail.com");
	driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='4']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
	WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	Actions action = new Actions(driver);
	action.moveToElement(loginbtn).click().perform();
	Thread.sleep(10000);
	WebElement settings = driver.findElement(By.xpath("//p[normalize-space()='Settings']"));
	Actions act = new Actions(driver);
	act.moveToElement(settings).click().perform();	
	WebElement support = driver.findElement(By.xpath("//p[normalize-space()='Support']"));
	Actions act1 = new Actions(driver);
	act1.moveToElement(support).click().perform();
	String actualmessage = driver.findElement(By.xpath("//p[normalize-space()='Call Us']")).getText();
	Assert.assertEquals(actualmessage, "Call Us");
	
	
	}
	
}
