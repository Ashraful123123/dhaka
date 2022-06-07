package Dhaka_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Demo {
	@Test
	public void assertDemo() {
		
		//======We are going to use two Method From Assert Class====//
		
		//1.equal
		//2.true
		Assert.assertEquals(10, 12);//My Actual result and expected result
		String ash = "Alam";
		Assert.assertTrue(true);
		System.out.println(ash);
	}

}
