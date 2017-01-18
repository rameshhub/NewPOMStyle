package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CreateBrowserInstance {
	
	WebDriver driver;
	
	
	public WebDriver instanceMethod(String browsername1 ){
		
		String s=browsername1;
		
		
		if(s.equals("firefox")){
			
		 driver =new FirefoxDriver();
		
		}
		
		
		
		else{
			 
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\chromedriver_win32\\chromedriver.exe");
			 
			 driver=new ChromeDriver();
			 
			 
		}
		
		
		return driver; 
		
	}
}
