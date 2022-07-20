package com.qa.testscript;

import com.qa.Utility.BaseClass;

public class VerifyPage extends BaseClass{
	public static void VerifyTitle()
	{
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Title matches");				
		}
		else
			System.out.println("Title does not match"); 
	}

}
