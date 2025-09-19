package seleniumbasics;

public class HandleBrowserCommands extends Base{
	
	public void verifyBrowserCommands()
	{
		String title = driver.getTitle(); // to get the title
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String handle_id = driver.getWindowHandle();
		System.out.println(handle_id);
		
		String source = driver.getPageSource();
		System.out.println(source);
		
	}

	public static void main(String[] args) {
		
		HandleBrowserCommands browsercommands = new HandleBrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.verifyBrowserCommands();

	}

}
