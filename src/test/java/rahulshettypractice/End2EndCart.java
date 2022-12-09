package rahulshettypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class End2EndCart {
  /*  WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("userEmail")).sendKeys("aamir@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("12345S@n");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		boolean toast = driver.findElement(By.id("toast-container")).isDisplayed();
		Assert.assertTrue(toast);
		
	}
	*/
	@Test(priority = 0)
	public void testOne() {
		System.out.println("test one");
	}
	
	@Test
	public void testP() {
		System.out.println("test p");
		Assert.fail();
	}
	@Test(priority = -1)
	public void testTwo() {
		System.out.println("test two");
	}
	
	@Test(priority = 1, enabled = false)
	public void testThree() {
		System.out.println("test three");
	}
	
	@Test(priority = -2)
	public void testFour() {
		System.out.println("test four");
	}
}
