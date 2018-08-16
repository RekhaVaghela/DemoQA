package com.qa.quickstart.demoQA;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class autocomplete {
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	private WebElement default_func;
	
	@FindBy(xpath = "//*[@id=\"tagss\"]")
	private WebElement tag;
	
	
	public void auto_search(Actions action) {
		WebElement[] options = {default_func, tag};
		for(int i = 0; i < options.length; i++) {
			options[i].click();
			action.sendKeys("a").perform();
			try {
				Thread.sleep(1000);
			} 	 catch(Exception e) {
				 }
		}		
		
	}
	
}
