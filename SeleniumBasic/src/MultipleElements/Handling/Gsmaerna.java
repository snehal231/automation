package MultipleElements.Handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gsmaerna {

	public static void main(String[] args) {
		
		WebDriver driver=setUp("chrome", "https://www.gsmarena.com/search.php3?");
		
		String expectedTitle1="GSMArena.com - mobile phone reviews, news, specifications and more... ";
		String actutalTitle1=driver.getTitle();
		if(actutalTitle1.equals(expectedTitle1)) {
			System.out.println(" page title validation is passed");
		}else {
			System.out.println(" page title validation is failed");
		}
		
			
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/aside/div/p[1]/a/span")).click();
		
		//identify all the suggestions
		List<WebElement> suggList=driver.findElements(By.cssSelector("#body > div.page-header.clearfix > aside > div"));


		//suggestion count #body > div.page-header.clearfix > aside > div
		//suggestion count 
		System.out.println("Suggestion count: "+suggList.size());
		
		for(int i=0;i<suggList.size();i++) {
			System.out.println(suggList.get(i).getText());
			
		}
		
		
		
	}
	public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
