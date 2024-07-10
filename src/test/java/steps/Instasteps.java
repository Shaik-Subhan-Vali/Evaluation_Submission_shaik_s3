package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Instasteps {
	WebDriver driver;
	

	
	@Given("User on Instagram login page")
	public void user_on_instagram_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User enters all Mandatory fields.")
	public void user_enters_all_mandatory_fields() {
	   driver.findElement(By.cssSelector("[name=\"emailOrPhone\"]")).sendKeys("Steverg9r3f07@gmail.com");
	   driver.findElement(By.cssSelector("[name=\"fullName\"]")).sendKeys("Steve Rogers");
	   driver.findElement(By.cssSelector("[name=\"username\"]")).sendKeys("Captafrind2ewnica");
	   driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("Steve@777");	   
	}

	@And("Clicks on Signup button")
	public void clicks_on_signup_button() {
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();   
		
	}

	@Then("Succesful sign in message should be displayed.")
	public void succesful_sign_in_message_should_be_displayed() {
		String act  = driver.findElement(By.xpath("//span[text()=\"Add Your Birthday\"]")).getText();  
		String exp = "Add Your Birthday";
		Assert.assertEquals(exp, act);
	
	}
}
