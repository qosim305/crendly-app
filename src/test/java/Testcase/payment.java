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



public class payment extends Base{

	@Test
	public void verifyuserpaymentWithBank() throws InterruptedException {
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
		Thread.sleep(3000);
		WebElement payment = driver.findElement(By.xpath("//a[@class='sidebar-menu selected-menu']//*[name()='svg']"));
		Actions act = new Actions(driver);
		act.moveToElement(payment).click().perform();
		driver.findElement(By.xpath(" //p[normalize-space()='Payment']")).click();
		WebElement addbank = driver.findElement(By.xpath("//button[normalize-space()='Add Bank Account']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(addbank).click().perform();
		
	}

	@Test
	public void VerifyUserPaymentWithCard() throws InterruptedException {
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
		Thread.sleep(3000);
		WebElement payment = driver.findElement(By.xpath("//a[@class='sidebar-menu selected-menu']//*[name()='svg']"));
		Actions act = new Actions(driver);
		act.moveToElement(payment).click().perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='Cards']")).click();
	}
}
