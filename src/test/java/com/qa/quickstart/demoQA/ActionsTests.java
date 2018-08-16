package com.qa.quickstart.demoQA;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ActionsTests {
	private WebDriver driver = null;
	Actions action;
		
	@Before
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions (driver);
		driver.manage().window().maximize();
	}
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void method() throws Exception {
		driver.get("http://demoqa.com/draggable/");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		draggable drag = PageFactory.initElements(driver,draggable.class);
		drag.movebox(action);	
		//while (true);		
			
		driver.get("http://demoqa.com/selectable/");
		selectable select = PageFactory.initElements(driver,selectable.class);	
		select.pickitem(action);
		//while (true);	
	}
		
	@Test
	public void widget() {
		driver.get("http://demoqa.com/accordion/");
		accordian selects = PageFactory.initElements(driver,accordian.class);	
		selects.collapsible(action);
		//while (true);		
	}
	
	@Test
	public void autocomplete() {
		driver.get("http://demoqa.com/autocomplete/");
		autocomplete autofill = PageFactory.initElements(driver, autocomplete.class);
		autofill.auto_search(action);
		
		
	}
}
