package create.stepDefinition;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateFirst {

	WebDriver d;
	public WebElement New;
	public WebElement Fname;
	public WebElement Lname;
	public WebElement mob;
	public WebElement pwd;
	public WebElement submit;
	
	@Given("^Launched the site$")
	public void launched_the_site() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	    
	}

	@When("^Click on new account$")
	public void click_on_new_account() throws Throwable {
	   New=d.findElement(By.linkText("Create New Account"));
	   New.click();
	   Thread.sleep(6000);
	
	}

	@When("^Enter FirstName$")
	public void enter_FirstName() throws Throwable {
		
	
		Fname=d.findElement(By.name("firstname"));
		Fname.sendKeys("Sunita");
	   
	}
	

	@When("^Enter LastName$")
	public void enter_LastName() throws Throwable {
	  Lname=d.findElement(By.name("lastname"));
	  Lname.sendKeys("Thakur");
		
	}

	@When("^Enter Mobile Number$")
	public void enter_Mobile_Number() throws Throwable {
		mob=d.findElement(By.name("reg_email__"));
		mob.sendKeys("7304084908");
	    
	}

	@When("^Enter new Password$")
	public void enter_new_Password() throws Throwable {
	   pwd=d.findElement(By.name("reg_passwd__"));
	   pwd.sendKeys("Masura@1979");
	}
	
	@When("^Select date$")
	public void select_date() throws Throwable {
		WebElement ddn=d.findElement(By.xpath("//*[@id='day']"));
		Select date=new Select(ddn);
		date.selectByVisibleText("6");
	    
	}

	@When("^Select Month$")
	public void select_Month() throws Throwable {
		
		WebElement ddn1=d.findElement(By.xpath("//*[@id='month']"));
		Select month=new Select(ddn1);
		month.selectByVisibleText("Sep");
	    
	}

	@When("^Select Year$")
	public void select_Year() throws Throwable {
		
		WebElement ddn2=d.findElement(By.xpath("//*[@id='year']"));
		Select year=new Select(ddn2);
		year.selectByVisibleText("1990");
	}

	@When("^Select Gender$")
	public void select_Gender() throws Throwable {
		WebElement radio=d.findElement(By.name("sex"));
		radio.click();
	    
	}



	@Then("^Click on sign Up$")
	public void click_on_sign_Up() throws Throwable {
		submit=d.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
	   
	}


}
