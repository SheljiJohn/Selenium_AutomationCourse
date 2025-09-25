package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumbasics.Base;

public class RadioButtonHandling extends Base {
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton = driver.findElement(By.cssSelector("input#inlineRadio1"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		
	}
	
	public void radioButtonVerify()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton = driver.findElement(By.cssSelector("input#inlineRadio1"));
		if(radiobutton.isSelected())
		{
			System.out.println("Radio button is aldready selected!!!");
		}
		else
		{
		radiobutton.click();
		}
		
		
	}
	
	public void radioButtonMultiple()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement radio : radiobutton)
		{
			if(radio.getAttribute("value").equals("Male"))
			{
				radio.click();
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioButtonHandling radioButtonobj = new RadioButtonHandling();
		radioButtonobj.initializeBrowser();
	//	radioButtonobj.radioButton();
	//	radioButtonobj.radioButtonVerify();
		radioButtonobj.radioButtonMultiple();
	}

}
