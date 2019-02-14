package MyFirstMavenProject.mySeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijayakumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		// finding the elements
		
		//<a href="/gp/help/customer/display.html?nodeId=200507590&amp;ref_=nav_topnav_help" class="nav-a" tabindex="24">Customer Service</a>
		
		boolean b= driver.findElement(By.xpath("//*[@tabindex = '24']")).isEnabled();
		driver.findElement(By.xpath("//*[@tabindex = '24']")).click();
		if(b)
		{
		System.out.println("Enabled");
		
		}
		
		
		//<a class="a-size-medium a-link-normal a-text-bold" href="/gp/css/order-history/ref=hp_ss_v3_yo_t4"> Your Orders</a>
		driver.findElement(By.partialLinkText("Your Orders")).click();
		
		
		//<input type="email" maxlength="128" id="ap_email" name="email" tabindex="1" class="a-input-text a-span12 auth-autofocus auth-required-field">
		//driver.findElement(By.id("ap_email")).sendKeys("vijayakumar.ceg@gmail.com");
		driver.findElement(By.xpath("//*[@tabindex = '1']")).sendKeys("vijayakumar.ceg@gmail.com");
		
		
		//<input id="continue" tabindex="5" class="a-button-input" type="submit" aria-labelledby="continue-announce">
		driver.findElement(By.xpath("//*[@tabindex = '5']")).click();
		
		
		//<input type="password" id="ap_password" name="password" tabindex="2" class="a-input-text a-span12 auth-autofocus auth-required-field">
		driver.findElement(By.id("ap_password")).sendKeys("House@143");
		
		
		//<input id="signInSubmit" tabindex="5" class="a-button-input" type="submit" aria-labelledby="a-autoid-0-announce">
		driver.findElement(By.className("a-button-input")).click();
		
		Boolean c = driver.findElement(By.partialLinkText("Vijay")).isDisplayed();
		System.out.println("Logged in Successfully");
		
		try {
		Thread.sleep(5000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
