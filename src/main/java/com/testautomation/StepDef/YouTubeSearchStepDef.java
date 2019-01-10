package com.testautomation.StepDef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomation.Utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubeSearchStepDef {
	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();
	
    @Given("^Open chrome browser and enter url$")
    public void open_chrome_browser_and_enter_url() throws InterruptedException {
       	Properties properties = obj.getProperty();
    	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium-ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(properties.getProperty("browser.baseURL"));
		Thread.sleep(3000);
    }
    @When("^Enter search criteria$")
    public void enter_search_criteria() throws InterruptedException {
    	driver.findElement(By.id("search")).sendKeys("selenium by bakkappa n");
    	Thread.sleep(1000);
    }
    @Then("^Click on search button$")
    public void click_on_search_button() throws InterruptedException {
    	driver.findElement(By.id("search-icon-legacy")).click();
    	Thread.sleep(3000);
    	driver.quit();
    }
}
