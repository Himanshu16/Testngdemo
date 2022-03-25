package demoTestNg.testngdemo;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App2 {
    
  
  @Test
  public void method() {
	  System.out.println("this is test");
}
	
	public static String browser = "chrome";
	public static WebDriver driver;
	
	@Test
	public  void driversetup() {
		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	@Test(dependsOnMethods ={"driversetup"})
	public void geturl() {
		driver.get("www.facbook.com");
	}
	
	@Test(dependsOnMethods ={"geturl"})
	
	public void gettitle(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}