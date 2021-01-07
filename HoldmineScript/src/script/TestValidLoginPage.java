package script;

import Test.HomePage.HomePage;
import Test.LogIn.LoginPage;
import generics.BaseTest;
import generics.FWUtils;

public class TestValidLoginPage extends BaseTest{
		

		public static void main(String[] args) throws InterruptedException 
		{	
			
			
			String un = "danny@yopmail.com";//FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,0);
			String pw = "Shan@9888";//FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,1);
		//	String expectedTitleETP = //FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,2);
			
			openBrowser("chrome");
			HomePage hp = new HomePage(driver);
			hp.clickOnLoginButton();
			
			LoginPage lp = new LoginPage(driver);
			lp.setUsername(un);
			lp.setPassword(pw);
			lp.clickOnLoginBTN();
			
			//FWUtils.verifyPageTitle(driver, "");
			
		/*	EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
			FWUtils.verifyPageTitle(driver,expectedTitleETP);
			etp.clickOnLogOutLink();
			*/
			Thread.sleep(5000);
			closeBrowser();
			
		

		}

}
