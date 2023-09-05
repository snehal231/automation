package Assignments.friday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtil;

public class VtigerTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtil.setUp("Chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		//Enter Username and Password
		WebElement inputUsername = driver.findElement(By.id("username"));
		inputUsername.clear();
		inputUsername.sendKeys("admin");
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.clear();
		passwordInput.sendKeys("Test@123");
		//Login 
		WebElement singinButton = driver.findElement(By.className("button"));
		singinButton.click();
		//Click on menu
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='appnavigator']/div")));
		//Click on marketing
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='MARKETING_modules_dropdownMenu']")));
		//Select Lead
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='mCSB_1_container']/li[2]/a")));
		//Click on new Lead
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='Leads_listView_basicAction_LBL_ADD_RECORD']")));
		//Enter First Name
		//driver.findElement(By.xpath("//*[@id='Leads_editView_fieldName_firstname")).sendKeys("PRADEEP");
		driver.findElement(By.name("firstname")).sendKeys("PRADEEP");
		//Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys("SHARMA");
		//Save the Details
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='EditView']/div[3]/div/div/button")));
		//Update Details.. Click on Edit button
		SeleniumUtil.clickOnElement(driver.findElement(By.id("Leads_detailView_basicAction_LBL_EDIT")));
		//Eneter Compony nAme
		driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("Google");
		//Enter Designation
		driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("Sr.Test Engineer");
	
		//Save the Updated Details-- Click on Save
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='EditView']/div[3]/div/div/button")));
		
		//Click on Leads
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='page']/nav/div[2]/div/div[3]/div/div[1]/a")));
		// DELETE Created Lead ----Click on check Box to Select Lead
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("//*[@id='Leads_listView_row_1']/td[1]/div/span[1]/input")));
		//SeleniumUtil.clickOnElement(driver.findElement(By.className("listViewEntriesCheckBox")));
		//Click on Delete Option
		SeleniumUtil.clickOnElement(driver.findElement(By.id("Leads_listView_massAction_LBL_DELETE")));
		//Comfirm Yes Option
		SeleniumUtil.clickOnElement(driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/button[2]")));
		
	}

}