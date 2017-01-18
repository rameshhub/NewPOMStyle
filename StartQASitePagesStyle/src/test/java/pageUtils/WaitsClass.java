package pageUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;

public class WaitsClass  {
	
	
	public Timeouts SampleWaitTest(WebDriver driver){
		
		
		Timeouts waitForElements= driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return waitForElements;
		
		
	}

}
