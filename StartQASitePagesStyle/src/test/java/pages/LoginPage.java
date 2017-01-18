package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageConstants.LoginPageConstants;
import pageUtils.WaitsClass;

public class LoginPage extends LoginPageConstants {
	
	
public void navigateUrl(WebDriver driver){
	
		driver.get(url);
	
	}
	
	
	
	public void LogInAction(WebDriver driver, WaitsClass impli){
		
		impli.SampleWaitTest(driver);
		
		driver.findElement(By.id(UserNameId)).sendKeys(UserNameValue);
		driver.findElement(By.id(NextId)).click();
		driver.findElement(By.id(PassWordId)).sendKeys(PassWordValue);
		driver.findElement(By.id(SignIn)).click();
		

	}
	



	

}
