package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1Test {

	WebDriver driver=null;
	
	@Test
	public void d1Test()
	{
		System.out.println("Hi");
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		/*String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);*/
	}
}
