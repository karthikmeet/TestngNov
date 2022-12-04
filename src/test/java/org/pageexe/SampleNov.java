package org.pageexe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleNov {

	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("test1");
		
	}

	
	@Test(priority = 2)
	public void test2() {
		System.out.println("test2");
		
		Assert.assertTrue(true);
	}
	
	@Test(priority = 1)
	public void test3() {
		System.out.println("test3");
	}

}
