package MouseOperation;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class SwagLabs {

	public static void main(String[] args) throws InterruptedException {
		//using setUp() launch required browser with URL and return browser instance
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.saucedemo.com/v1");
		//enter firstname
		WebElement firstNameInputField=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		//type admin and press Ctrl+a button using keys class
		firstNameInputField.sendKeys("standard_user",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//press Ctrl+c using keys class
		//firstNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
			/////////////////////////////////////////

		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	     driver.findElement(By.id("password")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	
			
	 
	    
	
		driver.findElement(By.id("login-button")).click();
		
	}

}