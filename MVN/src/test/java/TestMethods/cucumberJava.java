package TestMethods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.api.java.en.Given; 
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When; 

public class cucumberJava
{ 
   WebDriver driver = null; 
   static File junitReport;
   static BufferedWriter junitWriter;
   
   @Given("^I have open the browser$") 
   public void openBrowser() throws Exception 
   { 
	   System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	      driver = new ChromeDriver(); 
	               
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook()
   { 
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @Then("^Login button should exits$") 
   public void loginButton()
   { 
      if(driver.findElement(By.xpath("//input[@value='Log In']")).isDisplayed()) 
      { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}