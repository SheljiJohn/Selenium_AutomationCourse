package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver; //declared an object for WebDriver interface.
	
	public void initializeBrowser()
	{
	driver = new ChromeDriver(); // using  WebDriver interface we have set which browser needs to be launched
		//driver = new FirefoxDriver();
		driver.get("https://selenium.qabible.in/"); // to access this URL				
		driver.manage().window().maximize(); // to maximize or minimize window we are using driver.manage().window()
		//driver.manage().window().minimize(); // to maximize or minimize window we are using driver.manage().window()

	}
	
	public void closeBrowser()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		
		Base baseobject = new Base();
		baseobject.initializeBrowser();
		baseobject.closeBrowser();
	}

}
