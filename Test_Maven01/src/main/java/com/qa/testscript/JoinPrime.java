package com.qa.testscript;

import org.openqa.selenium.By;

import com.qa.Utility.BaseClass;

public class JoinPrime extends BaseClass{
	public static void Prime() throws InterruptedException
	{
	driver.navigate().to("https://www.amazon.in/amazonprime");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Login to join Prime']")).click();
	}
	
}
