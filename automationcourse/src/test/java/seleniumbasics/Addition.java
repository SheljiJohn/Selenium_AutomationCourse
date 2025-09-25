package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Addition extends Base{
	
	public void getTotal()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	WebElement inputa = driver.findElement(By.id("value-a"));
	inputa.sendKeys("-30");
	
	WebElement inputb = driver.findElement(By.id("value-b"));
	inputb.sendKeys("20");
	
	WebElement gettotal = driver.findElement(By.id("button-two"));
	gettotal.click();
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition additionobject = new Addition();
		additionobject.initializeBrowser();
		additionobject.getTotal();

	}

}
