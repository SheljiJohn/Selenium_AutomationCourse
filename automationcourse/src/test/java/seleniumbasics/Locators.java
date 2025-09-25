package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators  extends Base{

	public void id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		
		WebElement textfield = driver.findElement(By.id("single-input-field"));
		textfield.sendKeys("Hello..");
		
		WebElement button = driver.findElement(By.id("button-one"));
		button.click();
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement formcheckinput = driver.findElement(By.id("gridCheck"));
		//formcheckinput.click();
		WebElement checkbox = driver.findElement(By.id("check-box-one"));
		//checkbox.click();
		
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio = driver.findElement(By.id("inlineRadio1"));
		//radio.click();
		
		WebElement button1 = driver.findElement(By.id("button-one"));
		//button1.click();
		
		driver.navigate().to("https://selenium.qabible.in/table-sort-search.php");
		WebElement tabelement = driver.findElement(By.id("dtBasicExample"));
		//tabelement.click();
		
		
	}
	
	public void classsName()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement classelement1 = driver.findElement(By.className("clearfix"));
		WebElement classelement2 = driver.findElement(By.className("container page"));
		WebElement classelement3 = driver.findElement(By.className("header-top"));
		WebElement classelement4 = driver.findElement(By.className("top-logo"));
		WebElement classelement5 = driver.findElement(By.className("navbar-toggler"));
		WebElement classelement6 = driver.findElement(By.className("navbar-toggler-icon"));
		
	}
	
	public void name()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement nameelement1 = driver.findElement(By.name("viewport"));
		WebElement nameelement2 = driver.findElement(By.name("description"));
		WebElement nameelement3 = driver.findElement(By.name("keywords"));
		WebElement nameelement4 = driver.findElement(By.name("author"));
		driver.navigate().to("https://selenium.qabible.in/date-picker.php");
		WebElement nameelement5 = driver.findElement(By.name("daterange"));
		driver.navigate().to("https://selenium.qabible.in/bootstrap-dual-list.php");
		WebElement nameelement6 = driver.findElement(By.name("duallistbox_demo1[]"));
		
		
	}
	
	public void linkText()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement linktextelement1 = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement linktextelement2 = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement linktextelement3 = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linktextelement4 = driver.findElement(By.linkText("Select Input"));
		WebElement linktextelement5 = driver.findElement(By.linkText("Form Submit"));
		WebElement linktextelement6 = driver.findElement(By.linkText("Jquery Select2"));
		
	}
	
	public void partialLinkText()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement partiallinktextelement1 = driver.findElement(By.partialLinkText("Ajax Form"));
		WebElement partiallinktextelement2 = driver.findElement(By.partialLinkText("Radio B"));
		WebElement partiallinktextelement3 = driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partiallinktextelement4 = driver.findElement(By.partialLinkText("Select"));
		WebElement partiallinktextelement5 = driver.findElement(By.partialLinkText("Form S"));
		WebElement partiallinktextelement6 = driver.findElement(By.partialLinkText("Jquery S"));
	}
	
	public void tagName()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> tagnameelement1 = driver.findElements(By.tagName("a")); // total count of links available in current webpage. if multiple links available then use findElements instead of findElement
		System.out.println(tagnameelement1.size());
		
		List<WebElement> tagnameelement2 = driver.findElements(By.tagName("iframe"));
		System.out.println(tagnameelement2.size());
		
		List<WebElement> tagnameelement3 = driver.findElements(By.tagName("img"));
		System.out.println(tagnameelement3.size());
		
		List<WebElement> tagnameelement4 = driver.findElements(By.tagName("button"));
		System.out.println(tagnameelement4.size());
		
		List<WebElement> tagnameelement5 = driver.findElements(By.tagName("li"));
		System.out.println(tagnameelement5.size());
		
		List<WebElement> tagnameelement6 = driver.findElements(By.tagName("div"));
		System.out.println(tagnameelement6.size());
		
	}
	
	public static void main(String[] args) {
		
		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.id();
		locators.classsName();
		locators.name();
		locators.linkText();
		locators.partialLinkText();
		locators.tagName();
	}

}
