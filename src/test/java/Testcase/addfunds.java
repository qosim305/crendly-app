package Testcase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crebdly.base.Base;

import org.openqa.selenium.JavascriptExecutor;
public class addfunds extends Base{

	@Test
	public void verifyUserCanTopUp() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys(td.getProperty("valid_email"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='1']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='2']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='4']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='5']")).click();
	    driver.findElement(By.xpath("//button[normalize-space()='6']")).click();
	    WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(loginbtn).click().perform();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-350)", "");
		 Thread.sleep(5000);
		WebElement topup = driver.findElement(By.cssSelector("button[class='sc-bqiRlB iISjpp loan-action-btn'] span[class='sc-bBHxTw iEnUVg']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(topup).click().perform();		
		WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Enter amount']"));
		amount.click();
		amount.sendKeys("200,000");
		WebElement addfunds = driver.findElement(By.xpath("//button[@class='sc-bqiRlB gnDlOz payment-btn loan-action-btn']"));
		Actions act = new Actions(driver);
		act.moveToElement(addfunds).click().perform();
	}

	
	
}

