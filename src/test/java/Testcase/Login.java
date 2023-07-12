package Testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crebdly.base.Base;

public class Login extends Base{

	@Test
	public void verifyloginWithValiddetails() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys(td.getProperty("valid_email"));
		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='4']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
	    WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(loginbtn).click().perform();
	    System.out.println(driver.getTitle());
	    
	}
	
	@Test
	public void VerifyLoginwithinvalidDetails() {
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys("talk2oyinda@gmail.com");
		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='7']")).click();
	    WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(loginbtn).click().perform();
		driver.findElement(By.xpath("//p[@class='sc-fKVqWL dUNWB']"));
		System.out.println("Incorrect email or Password");
		
	}
	@Test
	public void verifyforgetpasscode() {
		WebElement forgetpwd = driver.findElement(By.xpath("//button[normalize-space()='Forget Passcode?']"));
		Actions action = new Actions(driver);
		action.moveToElement(forgetpwd).click().perform();
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		username.sendKeys("qosim305@gmail.com");
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
		Actions act = new Actions(driver);
		act.moveToElement(btn).click().perform();
		System.out.println("Verify current URL"+driver.getCurrentUrl());
	}
	
}
