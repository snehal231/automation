package Day5.DropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Countries {

	public static void main(String[] args) {
		WebDriver driver =setUp("chrome","https://demo.automationtesting.in/Register.html");
	
		WebElement dropdown =driver.findElement(By.xpath("//*[@id =\basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
		
		Select s1=new Select(dropdown);
		System.out.println("is multiselect dropdown.."+s1.isMultiple());
		WebElement defaultOption=s1.getFirstSelectedOption();
		System.out.println("By default select value is"+defaultOption);
		String defaultvalue=defaultOption.getText();
		System.out.println(defaultvalue);
		System.out.println("dropdown default select value "+s1.getFirstSelectedOption().getText());
		List<WebElement> optionList=s1.getOptions();
		int count=optionList.size();
		System.out.println("option count in dropdown: "+count);
		
	}

	

	

}
