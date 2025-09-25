package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {	
	
	public void RelativeXPath()
	{
		//tag[@attribute='value'] 		// syntax for relative XPath
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement relativeXpathelement1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement relativeXpathelement2 = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement relativeXpathelement3 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement relativeXpathelement4 = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement relativeXpathelement5 = driver.findElement(By.xpath("//button[@id='button-two']"));	
	}
	
	public void text()
	{
		//tag[text()='text']  	//syntax for text
		WebElement relativeXpathelement1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement relativeXpathelement2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement relativeXpathelement3 = driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement relativeXpathelement4 = driver.findElement(By.xpath("//label[text()='Enter value B']"));
		WebElement relativeXpathelement5 = driver.findElement(By.xpath("//label[text()='Enter Message']"));	
		
	}

	public void contains()
	{
		//tag[contains(@attribute,'value')]   	//syntax for contains
		WebElement relativeXpathelement1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement relativeXpathelement2 = driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement relativeXpathelement3 = driver.findElement(By.xpath("//input[contains(@id,'input-field')]"));
		WebElement relativeXpathelement4 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement relativeXpathelement5 = driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		WebElement relativeXpathelement6 = driver.findElement(By.xpath("//button[contains(@id,'-two')]"));
	}
	
	public void startsWith()
	{
		//tag[starts-with(@attribute,'value')] 		//syntax for startsWith
		WebElement relativeXpathelement1 = driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
		WebElement relativeXpathelement2 = driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
		WebElement relativeXpathelement3 = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement relativeXpathelement4 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement relativeXpathelement5 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
	}
	public void and()
	{
		//tag[@attribute='value' and @attribute='value']	//syntax for and
		WebElement relativeXpathelement1 = driver.findElement(By.xpath("//input[@class='form-control' and @id='value-b']"));
		WebElement relativeXpathelement2 = driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='button-one']"));
		WebElement relativeXpathelement3 = driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement relativeXpathelement4 = driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
		WebElement relativeXpathelement5 = driver.findElement(By.xpath("//button[contains(@id,'button-t')]"));
		
	}
	public void or()
	{
		//tag[@attribute='value' or @attribute='value']		//syntax for and
		WebElement relativeXpathelement1 = driver.findElement(By.xpath("//input[@class='form-control' or @id='value-b']"));
		WebElement relativeXpathelement2 = driver.findElement(By.xpath("//button[@class='btn btn-primary' or @id='button-one']"));
		WebElement relativeXpathelement3 = driver.findElement(By.xpath("//button[@class='btn btn-primary' or @type='button' or @id = 'button-one']"));
		WebElement relativeXpathelement4 = driver.findElement(By.xpath("//div[@class='my-2' or @id = 'message-one']"));
		WebElement relativeXpathelement5 = driver.findElement(By.xpath("//input[@type='text' or @class= 'form-control']"));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xpath xpathobj = new Xpath();
		xpathobj.initializeBrowser();
		xpathobj.RelativeXPath();
		xpathobj.text();
		xpathobj.contains();
		xpathobj.startsWith();
		xpathobj.and();
		xpathobj.or();
	}

}
