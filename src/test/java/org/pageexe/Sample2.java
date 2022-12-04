package org.pageexe;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Sample2 {
	
	
	@Test(invocationCount = 10)
	public void novbatch() throws InterruptedException
	{
		System.out.println("novbatch");	
		Thread.sleep(1000);
	}
	
	@Test(description = "check whether Submit button is working")
	public void sa()
	{
		System.out.println("sa");	
	}

}
