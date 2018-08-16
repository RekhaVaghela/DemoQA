package com.qa.quickstart.demoQA;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class accordian {
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	private WebElement section1;
	@FindBy(xpath = "//*[@id=\"ui-id-6\"]")
	private WebElement section2;
	@FindBy(xpath = "//*[@id=\"ui-id-8\"]")
	private WebElement section3;
	@FindBy(xpath = "//*[@id=\"ui-id-10\"]")
	private WebElement section4;
	
	
	public void collapsible(Actions action) {
		WebElement[] sections = {section1, section2, section3, section4};
		
		for(int i = 0; i < sections.length; i++) {
			sections[i].click();
			action.sendKeys(Keys.ARROW_UP).perform();
			action.sendKeys(Keys.ARROW_DOWN).perform();
			try {
				Thread.sleep(1000);
			} 	 catch(Exception e) {
				 }
		}		
	}
	
}
