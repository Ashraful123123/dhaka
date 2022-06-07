package Dhaka_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAccount {

	@Test//We are running our test with TestNG,so we gave @Test,it has a power to run the test,so we can run our test as a TestNg
	public void accountFb() throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://smallpdf.com/pdf-to-word");
	driver.manage().window().maximize();
	//driver.findElement(By.linkText("Create New Account")).click(); //LINKTEXT Locator///
	WebElement browse = driver.findElement(By.xpath("//*[@id=\"__cond-30\"]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]"));///CONTAINS LOCATOR//
	 browse.sendKeys("D:\\soft\\pdf.pdf");
	System.out.println("file uploaded");//Text() Function
	
	
	}
	
}
