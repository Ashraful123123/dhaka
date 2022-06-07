package Dhaka_Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; //if Webpage don't open a new window than
import org.testng.annotations.Test; //we don't have to use Window Handling
								//One Test case anything coming up I am going to handle it.
public class Window_Handle { /// Window handing means if Anything come I am going to handle it.
								// And I will come back to my parent window,from the child window that opened.
	@Test
	public void window_Handle() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/default.asp");
		driver.getTitle();
		driver.manage().window().maximize();
		// ===1st Step here,I am declearing my Parent Window===//
		// here we are handling only one window which is our parent window so,we used
		// getWindowHandling.
		//here I am declearing a variable =now what is the parent window?
		// he is returning only one string,and there is only one parent window
		// so,getWindowhandle.
		String parent_Window = driver.getWindowHandle();// Handling one window,current Window
		// Set <String> multipleWindow = driver.getWindowHandles();//Handling multiple
		// window.
		// driver.switchTo().window(parent_Window);
		// current Window
		System.out.println("current window title is "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/a")).click();
		Thread.sleep(2000);

		// Now we have to handle multiple window,so we will use(Set Interface)
		// Set give us some kind of list
		// Set is coming from Java ,Now are going to handle Multiple Window
		// so,(getWindowHandles)

		// Because getWindowHandles() Returning Set of String,We will have to hold it,in a Variable.
		// What kind data set it is? <String> or integer?
		// Any kind of new Window open -Set will handle that,multipleWindow will that.
		Set<String> multipleWindow = driver.getWindowHandles();// What kind of Set is that,it is a set of String
		// Size is returning integer value so,I will hold it in a Integer, int count
		int count = multipleWindow.size();// kotogulo child window open hoeche seta count korar jonno
		System.out.println(count);
		// Here we are saying that,Go to multiple window,where we gave a name child
		// Here multiple_Window holding All the child window opened later,
		//Because we are working with Set of String,so we declared here=== String child : multiWindow
		
		for (String child : multipleWindow) {// If we work with Generic means(Specific Data Type,
										    //-one kind of data type- (String,integer)or Single data type,
									       //list or array,we can use Advanced For Loop If we work with - 
									      //only one data type.then Advanced for loop
			 //If you find any child window
			//aikhane parent_window r value r sathe child r value check korbe.
		   //jodi duijoner value equal na hoi tahole loop a enter korbe.
			
			 //Prothom jei window r sathe check korbe seta hocche parent window
			//porer jei window r sathe check korbe seta hocche child window
		   //Aikhane .equalsIgnoreCase method coming from String.
			if (!parent_Window.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
	
				// than switch to child window //isDisplayed is returning boolean 
				// so,we stored it in a boolean variable
				//driver.switchTo().window(child); //isDisplayed is verifying is the text(SQLStatement:)
				// we are verifying it is displayed or not,boolean mean true or false
				// Since it is coming from boolean we have to store the value in a boolean
				// now result is holding the WebElement.
				// now result will return value like that = True or false,so we use boolean
				boolean result = driver.findElement(By.xpath("//h3[text()='SQL Statement:']")).isDisplayed();
				 driver.findElement(By.xpath("//button[@class=\"ws-btn\"]")).click();
				// You want to validate something,who is holding that verification
				//Selenium can not verify that,so we will tet that by the help of TestNG,where we have an assert Class
				Assert.assertTrue(result);  //Every Testcase should have that verification//
				//We use assert class for verifying something.
				//It will give the result is it true or false
				System.out.println("We are in child window");

				Thread.sleep(2000);
				System.out.println("current window title is "+driver.getTitle());
				driver.close(); // Now we are in the child window,now please close the child window only
								// don't close the Parent window
			}

			driver.switchTo().window(parent_Window); //If I need to come back in the
			// parent window again
			System.out.println("We are in Parent window");// and verify something again,than we will have to
			Thread.sleep(2000); // come back again in parent window,and will click something else

			// driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[9]")).click();
			//Here is the another webElement I will have to verify after the 1st Verificaton.
								
		}
		Thread.sleep(2000);
		driver.getTitle();
		// driver.close();
	}
	}

//Assert is a class coming fromTestNG
