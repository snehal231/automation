package MultipleElements.Handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  GsmaernaSamsung {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://www.gsmarena.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Manual Testing");
		driver.findElement(By.linkText("SAMSUNG")).click();
		//identify all the suggestions
		List<WebElement> suggList=driver.findElements(By.xpath("//*[@id=\"review-body\"]/div[1]/ul"));
		
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
