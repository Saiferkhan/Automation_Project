package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClassBDD {
	
	    WebDriver driver;

	    @Given("User is on the login page")
	   public void user_is_on_the_login_page() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://example.com/login");
	    }

	   @When("Enter the username{String} and password{String}")
	   public void Enter_the_username_and_password(String username ,String password) {
	        
	    }

	   @And("User click on the login button")
	   public void user_click_on_the_login_button() {
	        
	    }

	    @Then("User should see the homepage")
	    public void user_should_see_homepage() {
	        
	        }
	       
	    }
	


