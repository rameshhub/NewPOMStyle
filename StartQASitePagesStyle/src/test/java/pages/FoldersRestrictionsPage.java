package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.interactions.Actions;

import pageConstants.FoldersPageConstants;
import pageUtils.WaitsClass;

public class FoldersRestrictionsPage extends FoldersPageConstants{
	
	WebDriver driver;
	Actions a=new Actions(driver);
	
	public WebDriver FolderRestrictionsPage(WebDriver driver){

		return driver;
	}
	public void OpenSettingsDialog( WebDriver driver, WaitsClass waitForMe){
		
		
		waitForMe.SampleWaitTest(driver);
		a.moveToElement(driver.findElement(By.xpath(settingsId))).build().perform();
		
		
	}
	
	

}
