package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RenewDrakeSteps {

	WebDriver driver; 

@Given("User is on the main Drake page")
public void User_is_on_the_main_Drake_page() {
	System.out.println("User is on MainPage");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.drakesoftware.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"onetrust-button-group\"]/div/button")).click();
	
	
}

@When("User clicks on the Renew Drake button")
public void User_clicks_on_the_Buy_Drake_button() {
	driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
}
}
