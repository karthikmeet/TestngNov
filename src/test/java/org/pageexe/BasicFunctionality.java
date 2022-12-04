package org.pageexe;

import org.testng.annotations.Test;

public class BasicFunctionality {
	
	
	@Test(priority = -2)
	public void method1()
	{
		System.out.println("method1");
	}
	
	@Test(priority = 1)
	public void method()
	{
		System.out.println("method");
	}
	
	@Test(priority = 0)
	public void methodA()
	{
		System.out.println("methodA");
	}
}
