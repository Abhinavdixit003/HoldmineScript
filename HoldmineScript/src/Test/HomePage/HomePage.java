package Test.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class HomePage {

	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement lgnBtn;
	
	@FindBy(xpath = "//button[text()='Sign Up]")
	private WebElement signUpBtn;
	
	@FindBy(xpath = "//a[text()='Why Holdmine?']")
	private WebElement whyHoldmineLink;
	
	@FindBy(xpath = "//a[text()='How it Works']")
	private WebElement howItWorksLink;
	
	@FindBy(xpath = "//a[text()='Pricing']")
	private WebElement pricingLink;
	
	@FindBy(xpath = "//a[text()='Trusted Contacts']")
	private WebElement trustedContactsLink;
	
	@FindBy(xpath = "//div[@class='nav-drop-down']/ul/li/a[text()='About Us']")
	private WebElement aboutUsLink;
	
	@FindBy(xpath = "//div[@class='nav-drop-down']/ul/li/a[text()='Contact Us']")
	private WebElement contactUsLink;

	private WebDriver driverForActionClass;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 Actions actions = new Actions(driverForActionClass);
	 
	public void clickOnWhyHoldmineLink()
	{
		whyHoldmineLink.click();
	}
	
	public void clickOnHowItWorksLink()
	{
		howItWorksLink.click();
	}
	
	public void clickOnPricingLink()
	{
		pricingLink.click();
	}
	
	public void clickOnTrustedContactsLink()
	{
		trustedContactsLink.click();
	}
	
	
	public void mouseOverOnContactLink()
	{
		WebElement contactUsLink = driverForActionClass.findElement(By.xpath("//a[text()='Contact Us']"));
		actions.moveToElement(contactUsLink).perform();
	}
	
	public void clickOnAboutUs()
	{
		aboutUsLink.click();
	}
	
	public void clickOnContactUsLink() {
		contactUsLink.click();
	}
	
	public void clickOnLoginButton()
	{
		lgnBtn.click();
	}
	
	public void clickOnSignUpButton()
	{
		signUpBtn.click();
	}
}
