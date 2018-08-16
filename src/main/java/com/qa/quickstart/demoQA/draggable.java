package com.qa.quickstart.demoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class draggable {
	@FindBy(xpath = "//*[@id=\"draggable\"]")
	private WebElement draggable;
	
	public void movebox(Actions action) throws Exception {
		 action.dragAndDropBy(draggable ,150, 200).perform();
		 Thread.sleep(1000);
	}
}
	


