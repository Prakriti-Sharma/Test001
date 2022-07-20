package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.Utility.BaseClass;
import com.qa.testscript.Language;
import com.qa.testscript.VerifyPage;

public class Test001 extends BaseClass{
	@Test (priority= 1)
	public void method1() throws InterruptedException
	{
		driver.get("https://amazon.in");
		Thread.sleep(2000);
		VerifyPage.VerifyTitle();
	}
}
