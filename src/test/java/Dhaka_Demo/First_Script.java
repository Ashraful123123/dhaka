package Dhaka_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_Script {

	
	@Test       //I have to tell the java that i have a library for @Test,we will have to import that library
	public void first_scripts() throws Exception {
		/*
		 * //Setup Browser //this is a syntax
		 */		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		 //Here WebDriver is an interface who has lot of element
		//we need the access of all those element(like:CLASS,METHOD,Ex-window().manage()
	   //so we created an object of WebDriver Interface.
		
 //here I give,what is the browser we are going o work//which is chrome//
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); //Here get is a method,which is coming from the interface WebDriver
		driver.manage().window().maximize();	//And we are accessing that by creating a object of WebDriver.
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Alam");
		
		
		driver.findElement(By.name("pass")).sendKeys("12345"); //If I want to see the value from the Application we use (getAttribute method)
		String pass = driver.findElement(By.name("pass")).getAttribute("value");//It will show us the value in the console
		System.out.println("My pass is>>>>>>>>>"+ pass);
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();//Her we use linkitext because this is a link,
		  //and tag name is a,if the WebElement is a link than we wil use (Linktext)
		 //To write anything in the field,we will use sendKeys Method.
		//What I want to do in that WebElement?,I want to write so i gave = sendkeys.
		
	}
}
