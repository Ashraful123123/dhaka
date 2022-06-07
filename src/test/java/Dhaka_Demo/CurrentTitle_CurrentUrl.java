package Dhaka_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CurrentTitle_CurrentUrl {	
	@Test
	public void currentTitle() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.manage().window().maximize();
	
		//To check the Title of the Current WebPage Title
        String currentTitle = driver.getTitle();
		System.out.println("ActualTitle is :" + currentTitle );
		
		//To check the URL of the Current WebPage.

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Correct Url is:" +" "+ currentUrl);
		
		//TO check if my given URL is Right or Not.
		String url = driver.getCurrentUrl();

		if(url.equals(currentUrl)) {
			System.out.println("Correct url");
		}
		else {
		    System.out.println("InCorrect url");

		}
	}
}
