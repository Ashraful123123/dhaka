package Dhaka_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dell_Mousehover {
	
	
		
	@Test
	public void mouseHover() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//This two line is for Mouse Hovering any WebElement//
		Actions hover = new Actions(driver);//We will use Actions Class for Mouse Hovering in any WebElement 
		hover.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"))).build().perform();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Samsung")).click();
		//driver.findElement(By.xpath("//a[text()='Samsung']")).click();//Here I am using text function//
	
	}

}
