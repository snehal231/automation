package Assignment.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class ActitimeLogin {

	public static void main(String[] args) {
	//#username
		
		WebDriver driver=setUp("chrome");
	    //enter application URL
		driver.get("https://demo.actitime.com/login.do");    
		driver.findElement(By.cssSelector("#username")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("#loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input")).sendKeys("manager");
		//#loginButton > div
		WebElement btn=driver.findElement(By.cssSelector("#loginButton > div"));
		btn.click();

		
	}
		
		
		
		
		
		public static WebDriver setUp(String browserName) {
			WebDriver driver = null;
			if (browserName.equalsIgnoreCase("chrome")) {
				
			System.setProperty("webdriver.chrome.driver",".\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			return driver;

	}

}
