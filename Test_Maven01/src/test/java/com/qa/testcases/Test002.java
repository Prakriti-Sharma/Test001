package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.Utility.BaseClass;
import com.qa.testscript.AddBook;
import com.qa.testscript.VerifyPage;

public class Test002 extends BaseClass{
	@Test (priority = 1)
	public void method2() throws InterruptedException
	{
		AddBook.AddNewBook();
	}	
}
