package com.qa.quickstart.demoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class selectable {
		
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[1]")
	private WebElement item1;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[2]")
	private WebElement item2;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[3]")
	private WebElement item3;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[4]")
	private WebElement item4;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[5]")
	private WebElement item5;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[6]")
	private WebElement item6;
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[7]")
	private WebElement item7;

	public void pickitem(Actions action) {
		WebElement[] items = {item1, item2, item3, item4, item5, item6, item7};
		
		for(int i = 0; i < items.length; i++) {
			items[i].click();
			try {
				Thread.sleep(1000);
			} 	catch(Exception e) {
				}
		}		
		action.moveToElement(item2).clickAndHold().moveToElement(item5).perform();		
	}
}
