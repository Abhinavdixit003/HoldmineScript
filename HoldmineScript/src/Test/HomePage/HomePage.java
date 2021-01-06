package Test.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement lgnBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLoginBTN()
	{
		lgnBtn.click();
	}
	
}
