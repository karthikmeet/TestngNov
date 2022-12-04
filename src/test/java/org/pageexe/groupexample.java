package org.pageexe;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupexample {
	@Test(groups = "GroupA")
	public void Ind() {
		System.out.println("Ind");
		
	}

	@Test(groups = "GroupA")
	public void Pak() {
		System.out.println("Pak");
	}
	
	@Test(groups = "GroupB")
	public void Aus() {
		System.out.println("Aus");
	}
	
	@Test(groups = "GroupB")
	public void SL() {
		System.out.println("SL");
	}

}
