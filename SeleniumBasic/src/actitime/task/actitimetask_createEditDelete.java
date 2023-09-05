package actitime.task;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	import utilities.SeleniumUtil;

	public class actitimetask_createEditDelete {

		public static void main(String[] args) {
			WebDriver driver=SeleniumUtil.setUp("firefox","https://demo.actitime.com/login.do");
		    //login username & password
			SeleniumUtil.typeInput(driver.findElement(By.cssSelector("#username")), "Admin");
			SeleniumUtil.typeInput(driver.findElement(By.cssSelector("#loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input")), "manager");

			//click on login btn
			WebElement btn=driver.findElement(By.cssSelector("#loginButton > div"));
			btn.click();
			
	       //click on Add btn 
			driver.findElement(By.xpath("/html/body/div[16]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[1]/table/tbody/tr/td[7]/div/div[2]/span")).click();
			//select drop down list
			WebElement dropdown=driver.findElement(By.cssSelector(".customerSelector > div:nth-child(1) > div:nth-child(1) > div"));
			dropdown.click();
			//click on dropdown
			driver.findElement(By.cssSelector("#createTasksPopup_content > div.scrollableContainer > div.contentWrapper > div > div.customerProjectSelectorPlaceholder > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > div > div.scrollableDropdownView > div > div.contentWrapper > div > div:nth-child(1)")).click();
			
	        //Enter customer name
			driver.findElement(By.cssSelector("input[placeholder='Enter Customer Name']")).sendKeys("Rocky3");
			//enter project name
			driver.findElement(By.cssSelector("input[placeholder='Enter Project Name']")).sendKeys("xyzkkkkk");
			//enter task name
			driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("dailyUpdate5");
			//cliick on create task btn
			driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
			driver.close();//div[text()='dailyUpdate']   
			//click on task 
			driver.findElement(By.xpath("/html/body/div[16]/form/table/tbody/tr/td/table[2]/tbody[2]/tr[3]/td[2]/div/div[2]/div[1]")).click();
			//click on actions
			driver.findElement(By.cssSelector(".pressed")).click();
			//click for delete
			driver.findElement(By.xpath("//div[text()='Delete']")).click();
			
			
			
			
			
			
			
			
		
			
			

		}

	}