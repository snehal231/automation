package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		
public class FacebookOpening{
	
		public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "G:\\selenium\\SeleniumBasic\\executables\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("sneha chougale"));
		username.sendKeys("sneha chougale");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.className("pwdfield"));
		password.sendKeys("manager");
		WebElement Login=driver.findElement(By.id("loginButton"));
		Login.click();
		System.out.println("sucessfully login");
		//driver.close();
		       
		
		}
		}
