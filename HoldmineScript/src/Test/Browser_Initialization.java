package Test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Initialization {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.staging.holdmine.com");
	}
	
	
	
}
