package steps1;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tlh.ach;

public class form_steps {
	WebDriver driver;
	
	@Given("User on simple form page")
	public void user_on_simple_form_page() {
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("User enters all Mandatory fields")
	public void user_enters_all_mandatory_fields() {
	    driver.findElement(By.cssSelector("[id=\"firstName\"]")).sendKeys("Shaik");
	    driver.findElement(By.cssSelector("[id=\"lastName\"]")).sendKeys("Subhan");
	    driver.findElement(By.cssSelector("[id=\"email\"]")).sendKeys("Shaik@gmail.com");
	    driver.findElement(By.cssSelector("[id=\"number\"]")).sendKeys("7989335677");
	}

	@And("User enters text in message field")
	public void user_enters_text_in_message_field() {
		driver.findElement(By.cssSelector("[rows=\"2\"]")).sendKeys("Hello all");
	}

	@And("Clicks on submit button")
	public void clicks_on_submit_button() {
		driver.findElement(By.cssSelector("[value=\"submit\"]")).click();
	
	}

	@Then("Thank you should be displayed.")
	public void thank_you_should_be_displayed() {
	   Alert A = driver.switchTo().alert();
	   String Act = A.getText();
	   String exp ="Thank You for reaching out to us, Shaik Subhan";
	   Assert.assertEquals(exp, Act);
	   
	}

}
