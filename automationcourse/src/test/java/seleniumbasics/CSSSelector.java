package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CSSSelector extends Base {

	//1.Tag and ID(tag#id)
	//2.Tag and class(tag.class)
	//3.Tag and Attribute(tag[attribute='value']
	//4.Tag,class,and Attribute(tag.classname[attribute='value']
	
	public void tagAndID()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement tagIDElement1 = driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagIDElement2 = driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagIDElement3 = driver.findElement(By.cssSelector("button#button-two"));
	WebElement tagIDElement4 = driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagIDElement5 = driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagIDElement6 = driver.findElement(By.cssSelector("div#message-one"));
	}
	
	public void tagAndClass()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement tagClassElement1 = driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement tagClassElement2 = driver.findElement(By.cssSelector("div.header-top"));
	WebElement tagClassElement3 = driver.findElement(By.cssSelector("div.top-logo"));
	WebElement tagClassElement4 = driver.findElement(By.cssSelector("a.navbar-brand"));
	WebElement tagClassElement5 = driver.findElement(By.cssSelector("ul.navbar-nav"));
	WebElement tagClassElement6 = driver.findElement(By.cssSelector("span.navbar-toggler-icon"));
	}
	
	public void tagAndAttribute()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement tagAttributeElement1 = driver.findElement(By.cssSelector("input[id='value-a']"));
	WebElement tagAttributeElement2 = driver.findElement(By.cssSelector("button[id='button-two']"));
	WebElement tagAttributeElement3 = driver.findElement(By.cssSelector("button[id='button-one']"));
	WebElement tagAttributeElement4 = driver.findElement(By.cssSelector("span[class='navbar-toggler-icon']"));
	WebElement tagAttributeElement5 = driver.findElement(By.cssSelector("button[class='navbar-toggler']"));
	WebElement tagAttributeElement6 = driver.findElement(By.cssSelector("a[id='alert-modal']"));
	}
	
	public void tagClassAndAttribute()
	{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement tagClassAttributeElement1 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
	WebElement tagClassAttributeElement2 = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	WebElement tagClassAttributeElement3 = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	WebElement tagClassAttributeElement4 = driver.findElement(By.cssSelector("div.my-2[id='message-two']"));
	WebElement tagClassAttributeElement5 = driver.findElement(By.cssSelector("a.nav-link[id='alert-modal']"));
	driver.navigate().to("https://selenium.qabible.in/ajax-form-submit.php");
	WebElement tagClassAttributeElement6 = driver.findElement(By.cssSelector("input.form-control[placeholder='Subject']"));		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSSSelector cssselectorobj = new CSSSelector();
		cssselectorobj.initializeBrowser();
		cssselectorobj.tagAndID();
		cssselectorobj.tagAndClass();
		cssselectorobj.tagAndAttribute();
		cssselectorobj.tagClassAndAttribute();
	}

}
