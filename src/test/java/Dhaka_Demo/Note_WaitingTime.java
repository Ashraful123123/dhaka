package Dhaka_Demo;

public class Note_WaitingTime {
	
	//Hard wait= Thread.sleep(5000);it will wait until the time we give
	//Soft wait= If the execution is done then it will go in next execution
	
	//===========================Thread.sleep==============================//
	/*
	 * It will wait 20seconds even if it found the webelement in 5 seconds It will
	 * stop all the execution for 20 seconds
	 */

	//==========================Implicitlywait===========================//
	/*
	 * Before lunching the url,we use this Implicitwait to lunch the URL properly If
	 * My url open before 10 seconds it will open my url,it will not wait upto 20
	 * sec.
	 */

	//========================ExplicitWaitlyWait=======================//
	/*
	 * Exlicit wait also call WebDriver wait
	 * we will use it between the Webelements.like In a Test scenario we can have
	 * multiple test steps to check Now, if we have two steps,and we done our 1st
	 * step properly We not going to wait 20 Seconds.We will go to the next step =
	 * ExplicitWait.
	 */

	//=========================PageLoadOut============================//
	/*
	 * After lunching the url, now will wait till all the WebElement loaded
	 * perfectly. To load all the WebElement behind the DOM,we will use
	 * =pageLoadOut()
	 */
	/*
	 * ========================Wait================================== 
	 * We will use
	 * this at last line or stage There are different types of wait we use in my
	 * code Mostly we use soft wait,In soft wait we have implicitWait and
	 * ExplicitWait There is another wait which is hard wait Normally for executing
	 * test cases we don't use hard wait,we use soft wait For one step to another
	 * step it will upto 20 seconds
	 * 
	 * ===============================================================
	 * For WebElement Synchronization issue we use
	 * Explicit Wait.And we use ExplicitWait between the webElements
	 * This is also called WebDriver Wait
	 */
	/*
	 * Sometimes it happens beacause of my internet issue, My browser takes time to
	 * open but machine don't know that,it thinks that is his first steps it will
	 * try to open amazon.com but it will not find any platform to type amazon.com.
	 * Beacause My browser Chrome didn't open yet because of some issue,it's still
	 * loading then it will give failed status/or error status//
	 * ============================== 
	 * Sometimes we will have to give time to my
	 * other steps to execute properly// Like to my first steps 2 we will
	 * negotiate-Execute your step properly, take some time,then let me know when
	 * you finished finished your execution,then I will start my 3rd execution
	 * ============================== 
	 * So,it's like a Synchronization between the
	 * steps// we will use some code Without Synchronization my execution will work
	 * properly// but sometime for the internet slowness/slowness of server/ server
	 * issue//many executing their code from the same server developer working on
	 * server for fixing something Because of that,we have to give some time to our
	 * steps for execution/
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	 * =================================
	 */
	//===========================HARD WAIT==============================
	/*
	 * it will wait until the time we give hard wait we use to check our code slowly
	 * when we write a script we try to check all steps slowly how it's working No
	 * matter what the next step will be execute after 5seconds We can keep the HArd
	 * Wait anywhere Hard wait always declared by MiliSeconds Maximum we use Five
	 * seconds We will use Hard Wait between the WebElements Normally Automation is
	 * super fast,But if we want to see how every steps is working Then we Can use
	 * hard wait food ordering system.
	 */
	
	//=========================Explicit wait========================
	/*
	 * For WebElement Synchronization issue we use Explicit Wait. And we use
	 * ExplicitWait between the webElements// This is also called WebDriver Wait
	 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20)); We will
	 * use this at last line or stage There are different types of wait we use in my
	 * code Mostly we use soft wait,In soft wait we have implicitWait and
	 * ExplicitWait ================================= There is another wait which is
	 * hard wait Normally for executing test cases we don't use hard wait,we use
	 * soft wait For one step to another step it will upto 20 seconds
	 */

}
