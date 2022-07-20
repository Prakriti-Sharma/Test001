package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.Utility.BaseClass;

public class Language extends BaseClass{
	public static void ChangeLanguage(int i) throws InterruptedException
	{
		WebElement element = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
		Thread.sleep(2000);
		List<WebElement> x = driver.findElements(By.xpath("//a[contains(@href,'#switch-lang')]/span/i"));
		x.get(i).click();
		Thread.sleep(2000);
	}
}
