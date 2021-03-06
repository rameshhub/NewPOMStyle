package pageFunctions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import browser.CreateBrowserInstance;
import pageUtils.WaitsClass;
import pages.FoldersRestrictionsPage;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;


public class MainClass extends CreateBrowserInstance {
	
	WebDriver driver;
	
	@Test()
	@Parameters({"browsername1"})
	public void StartMethod(String browsername1){
		
		MainClass obj =new MainClass();
		
		LoginPage login=new LoginPage();
		
		WaitsClass waitForMe =new WaitsClass();
			
		driver = obj.instanceMethod(browsername1);
		
		 login.navigateUrl(driver);
	
		 login.LogInAction(driver,waitForMe );
		 
		 HomePage hm=new HomePage();
		 
		 hm.navigatingToFolders(driver);
		 
		 FoldersRestrictionsPage fg=new FoldersRestrictionsPage();
		 
		
		 
		 fg.OpenSettingsDialog(driver, waitForMe);
		 
		// fg.FolderRestrictionsPage(driver);
		 
		// hm.logout(driver);
		 
		// driver.close();

	}
	
	
}
	
	
