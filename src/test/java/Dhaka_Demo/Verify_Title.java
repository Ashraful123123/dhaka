package Dhaka_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Title {

	@Test
	public void titleVerify() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.manage().window().maximize();
		// PDF to Word Converter - 100% Free
		String expectedTitle = "PDF to Word Converter";//User story we can see the Title give us the Expected Title//
		//String actual = "";
		String actualTitle = driver.getTitle();
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("test case passed");
		} else {
			System.out.println("test case failed");

		}
		driver.close();

	}
}
