package MultipleElements.Handling;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://www.flipkart.com/");
		String expectedTitle1="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actutalTitle1=driver.getTitle();
		if(actutalTitle1.equals(expectedTitle1)) {
			System.out.println(" page title validation is passed");
		}else {
			System.out.println(" page title validation is failed");
		}
		
		
		
		
		
		
		
	
		
		//identify all the suggestions
	List<WebElement> suggList=driver.findElements(By.cssSelector("#container > div > div.q8WwEU > div > div > div > div > div.css-1dbjc4n.r-13awgt0 > div > div.css-1dbjc4n.r-13awgt0.r-1iqfa7g.r-60vfwk > div > div.yAlKeh > div._2L0uxW > div > div:nth-child(1) > div > div"));
		
		
		//suggestion count
		System.out.println("Suggestion count: "+suggList.size());
		
		for(int i=0;i<suggList.size();i++) {
			System.out.println(suggList.get(i).getText());
		}
		
		
	}
	public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executable\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}