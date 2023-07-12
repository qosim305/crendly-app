package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crebdly.base.Base;

public class transaction extends Base{


	@Test
	public void verifyusercanviewtransactions() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Email or Phone number']"));
		login.sendKeys("qosim305@gmail.com");
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
		// Thread.sleep(2000);
		WebElement transactions = driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > a:nth-child(3) > p:nth-child(2)"));
		Actions act = new Actions(driver);
		act.moveToElement(transactions).click().perform();
		WebElement text = driver.findElement(By.cssSelector(".sc-iwjdpV.eamLga"));
		Assert.assertTrue(text.isDisplayed());

	}

	
	
	

}
