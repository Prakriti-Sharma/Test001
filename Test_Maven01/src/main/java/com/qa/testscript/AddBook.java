package com.qa.testscript;

import org.openqa.selenium.By;

import com.qa.Utility.BaseClass;

public class AddBook extends BaseClass {

	public static void AddNewBook() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Books' and contains(@class,'nav-a')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ol[@class='a-carousel']/li")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	}

}
