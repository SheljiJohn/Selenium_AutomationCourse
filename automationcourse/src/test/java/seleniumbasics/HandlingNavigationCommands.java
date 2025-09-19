package seleniumbasics;

public class HandlingNavigationCommands extends Base {
	
	public void verifyNavigationCommands()
	{
		//driver.navigate().to("https://www.amazon.in/"); 
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingNavigationCommands navigationcommands = new HandlingNavigationCommands();
		navigationcommands.initializeBrowser();
		navigationcommands.verifyNavigationCommands();

	}

}
