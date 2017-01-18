package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageConstants.HomePageConstants;

public class HomePage extends HomePageConstants {
	
	public void navigatingToFolders(WebDriver driver){
		
		driver.findElement(By.id(folderId)).click();
	}
	
	public void logout(WebDriver driver){
		
		driver.findElement(By.id(userDropDownId)).click();
		driver.findElement(By.id(logoutId)).click();
		
		
	}
	
	

}
