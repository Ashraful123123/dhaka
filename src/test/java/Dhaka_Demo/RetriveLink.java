package Dhaka_Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetriveLink {

	
	@Test //I have the library for@tTestNG go and read it
	public void retriveValue() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://smweb.suffixit.com:8576/");
		//driver.manage().window().maximize();
		//Here findElements returning List of WebElement,here List and webElement are Interface
		//Returning== List<WebElement>
		//Here we are finding the link WebElement, So we find them 
		//By their Tagname, which is Linktext=<a>
		//Since it is returning us List of LINK,we can hold it in a List interface.
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		//Here we are working with <webelement>,but if we work with <String> or <Integer> we will give that one.
		//Since we are working with LIST of link so,we used LIST interface
		//And we are holding all those Link in a Variable name =(allLink)
		
		
		//int a = allLink.size();
		System.out.println("Number of Link in this Web Application" +" "+ allLink.size());
				
		//.size() it will take the size Automatically
		//Here .size() everytime give us the total size of the array.
		for(int i=0;i<allLink.size(); i++) {
			//Selenium give us one of method which is getAttribute;
			//it is responsible for collecting all the link
			//get attribute has one of the Attribute which is href.
			//href bring all the link
							 //here our loop is i so,get(i)
							//Href is the common attribute name for getting link
			System.out.println(allLink.get(i).getAttribute("href"));	
										//get(i) return us the value of that IndexNo.
			//selenium given us getAttribute method,and saying us what is the name of that attribute
			//And By default Attribute name is "href"
			//Now we will have to give getAttribute method and attribute name
			// "href" is the common Attribute name for any kind of link

		}
		
		//Here WebElement returning us all the WebElement which is LINK.
		Thread.sleep(3000);
	}
}
