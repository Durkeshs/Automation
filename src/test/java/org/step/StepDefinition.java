package org.step;


import org.openqa.selenium.By;
import org.test.Rerunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition  extends Rerunner{
	

	@Given("user launches google chrome and amazon application")
	public void user_launches_google_chrome_and_amazon_application() {
	  Hooks. driver.findElement(By.id("email")).sendKeys("ko");
	   
	}

	@When("user seaches laptop  and click seach")
	public void user_seaches_laptop_and_click_seach() {
		Hooks.driver.findElement(By.id("nav-search-submit-text")).click();
}

	@Then("user navigates to laptop page")
	public void user_navigates_to_laptop_page() {
	    System.out.println("laptop");
	}

	@Given("user launches google chrome and amazon app")
	public void user_launches_google_chrome_and_amazon_app() {
		Hooks. driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		   
	}

	@When("user seaches iphone  and click seach")
	public void user_seaches_iphone_and_click_seach() {
		Hooks.	driver.findElement(By.id("nav-search-submit-text")).click();
	}

	@Then("user navigates to iphone page")
	public void user_navigates_to_iphone_page() {
		System.out.println("iphone");
	}

	@Given("user launches google chrome and amazon")
	public void user_launches_google_chrome_and_amazon() {
		Hooks. driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		   
	}

	@When("user seaches watches  and click seach")
	public void user_seaches_watches_and_click_seach() {
		Hooks.driver.findElement(By.className("nav-input")).click();
		
		
	}

	@Then("user navigates to watches page")
	public void user_navigates_to_watches_page() {
Assert.assertTrue(false);

	}
	
	}


	    
	    
	
	
	
	
