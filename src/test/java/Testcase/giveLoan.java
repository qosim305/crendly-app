package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crebdly.base.Base;

public class giveLoan extends Base{

	@Test
	public void verifyGiveLoan() throws InterruptedException {
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
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".loan-option-card-1")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='loanTypeId']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Personal Loan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Portfolio amount']")).sendKeys("20000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter number of people']")).sendKeys("2");
		Thread.sleep(2000);
		WebElement nextbtn = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
		Actions act = new Actions(driver);
		act.moveToElement(nextbtn).click().perform();
		driver.findElement(By.xpath("//div[@class='loan-tenor-types']//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='sc-kDTinF eBuPjT']//div[@class='loan-tenor-types']//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//div[@class='sc-kDTinF eBuNoo']//div[1]//div[1]//input[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Number of Days']")).sendKeys("3");
		WebElement cont = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        Actions act1 = new Actions(driver);
        act1.moveToElement(cont).click().perform();
	    driver.findElement(By.xpath("//div[@class='loan-tenor-types']//div[1]//input[1]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter Interest']")).sendKeys("200");
	    driver.findElement(By.xpath("//input[@name='isNegotiable']")).click();
	    WebElement nxtbtn = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
	    Actions act2 = new Actions(driver);
	    act2.moveToElement(nxtbtn).click().perform();
	    WebElement pubbtn = driver.findElement(By.xpath("//button[normalize-space()='Publish Loan Offer']"));
	    Actions act3 = new Actions(driver);
	    act3.moveToElement(pubbtn).click().perform();
	    String message = driver.findElement(By.xpath("//div[@class='popup-title-wrapper']/h4")).getText();
	    Assert.assertEquals(message, "Loan Portfolio");
	    
	}

}
