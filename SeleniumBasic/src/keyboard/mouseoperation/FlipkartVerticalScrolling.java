package keyboard.mouseoperation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FlipkartVerticalScrolling {

	public static void main(String[] args) {
		
     // Launch chrome browser
		
	System.setProperty("webdriver.chrome.driver", "G:\\selenium\\SeleniumBasic\\executables\\chromedriver.exe");
	WebDriver driver =	new WebDriver();
	
	//maximize browser
	
	driver.manage().window().maximize();
	
	//open url
	
	driver.get("https://www.flipkart.com/");
	
JavascriptExecutor js =(JavascriptExecutor)driver;

try {
	Thread.sleep(3000);
}  catch (InterruptedException e) {
	e.printStackTrace();
}

js.executeScript("window.scrollBy(0,500)");



}
	
		

	}
