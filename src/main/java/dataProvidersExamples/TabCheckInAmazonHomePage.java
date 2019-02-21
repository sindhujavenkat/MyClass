package dataProvidersExamples;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabCheckInAmazonHomePage {

	WebDriver driver =null;
	Properties property = new Properties();
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I am at before test");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}
	
	
	public void productSearch(String tabnames, String expectedTitle)
	{
		
		driver.findElement(By.partialLinkText(tabnames)).click();
	
	
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
				
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println(tabnames + " Tab is tested successfully");
		driver.get("https://www.amazon.in");
	
	}
	
	@Test(dataProvider="TabNames", dataProviderClass=DataProviderClass.class)
	
	public void searchingProducts(String tabnames,String expectedTitle) {
		
		//System.out.println("I am in this tab"+tabnames);
		productSearch(tabnames,expectedTitle);
		
	}

	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("I am at after test");
		driver.quit();
	}
	
	
	
	
}
