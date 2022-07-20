package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.Utility.BaseClass;
import com.qa.testscript.Language;

public class Test003 extends BaseClass{
	@Test (priority = 1)
	public void method3() throws InterruptedException {
		
		Thread.sleep(2000);
		Language.ChangeLanguage(0);
		Language.ChangeLanguage(0);
	}

}
