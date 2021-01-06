package Test.LogIn;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class LoginPage
	{
		//declaration of variable
		@FindBy(xpath = "//input[@name = 'email']")
		private WebElement unTB;
		
		@FindBy(xpath = "//input[@name = 'password']")
		private WebElement pwTB;
		
	
		@FindBy(xpath="//button[text()='Log In']")
	    private WebElement lognBTN;
		
				
		//initialize the Elements
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//utilization of WebElements
		
		public void setUsername(String un)
		{
			unTB.sendKeys(un);
		}
		public void setPassword(String pw)
		{
			pwTB.sendKeys(pw);
		}
		
		
		public void clickOnLoginBTN()
		{
			lognBTN.click();
		}
	}
		
	/*	public void verifyErrMSg(WebDriver driver)
		{
/*			String expectedERRMSG ="";
			String actualERRMSG = errMSG.getText();
			if(actualERRMSG.equals(expectedERRMSG))
			{
				System.out.println("The ErrorMSg is Displayed-->"+expectedERRMSG);
			}
*/			
		/*	if(errMSG.isDisplayed())
			{
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.visibilityOf(errMSG));
				
				System.out.println("The ErrMsg is Dispalyed--->"+errMSG.getText());
			}*/
			
		
	

