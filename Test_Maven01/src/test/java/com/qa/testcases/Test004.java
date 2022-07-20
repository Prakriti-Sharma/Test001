package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.Utility.BaseClass;
import com.qa.testscript.JoinPrime;

public class Test004 extends BaseClass{
	@Test (priority= 1)
	public void method4() throws InterruptedException
	{
		Thread.sleep(2000);
		JoinPrime.Prime();
	}
}
