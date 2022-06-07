package Dhaka_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Drop_Down {
	
	@Test
	public void dropDown() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	//WebElement is An Interface provided by the Selenium	
	 //Here I created a variable of WebElement
     //Datatype   Variable name  = here is the location of the WebElement
	//TO Access any webElement we can use WebElement Interface
		
		WebElement     down      = driver.findElement(By.id("gh-cat"));//Here this is the value
		
		// Here down is a variable who is holding the Web Element
		//WebElement is an Interface who returns All the Web Elements
		//This WebElement Interface returning every WebElement from the Web Application which I am Testing
		
		
		//Here Select is A Class given by the Selenium.
		//So,I need to access that class.so, I created an object of Select Class so I can access that class.
		
		//Now Select is saying you want to select something,who is Holding that,down variable is holding that location.
		
		//Any kind of DropDown we will have  to use Select Class
		Select dropDown = new Select(down); //Here down has the webElement location already
		//dropDown.selectByVisibleText("Baby");
		dropDown.selectByValue("20081");
		//dropDown.selectByIndex(1);
		
		//Select is nothing but a Class given by Selenium,to Select Any drodown element//
		//So,now to access that SELECT CLass we will have create an object of SELECT Class.
		
	}
}
