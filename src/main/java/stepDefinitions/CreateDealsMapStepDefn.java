/*package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateDealsMapStepDefn {
	WebDriver  driver;
	
	@Given("^user is already on Login Page$")
		public void User_is_already_on_Login_Page() throws InterruptedException  {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
					"\\browserdrivers\\chromedriver_win32V83\\chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\79.0.3945.88_chrome_installer.exe");
			   driver=new ChromeDriver();
			   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			   // driver.wait(10);
			   driver.get("https://classic.crmpro.com/index.html?e=1");
		}

	@When("^title of login page is Free CRM$")
		public void title_of_page_is_Free_CRM()  {
			String title=driver.getTitle();
			String expectedtitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
			System.out.println("title of login page is "+title);
			Assert.assertEquals(expectedtitle, title);
				}

		
	@Then("^user provides login credentials username and password$")
		public void user_provides_username_and_password(DataTable usercredentials)
		  {
			//String username="crmseltest";
			//String password="test@123";
		   List<Map<String,String>> data = usercredentials.asMaps();
			driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys(data.get(0).get("username"));
			driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(data.get(0).get("password"));
		}

		@Then("^user clicks on login button$")
		public void user_clicks_login_button() {
			WebElement loginBtn=driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input[@type='submit']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",loginBtn);
		}

		@Then("^user is on home page$")
		public void user_is_on_home_page()  {
			String title=driver.getTitle();
			System.out.println("title of home page is "+title);
			Assert.assertEquals("CRMPRO", title);
		
		}
		
		@Then("^user moves to new deal page$")
		public void user_moves_to_new_contact_page() {
			driver.switchTo().frame("mainpanel");
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
			driver.findElement(By.xpath("//a[@title='New Deal']")).click();
		}

		 @Then("^user enters deal details$")
	      public void user_enters_contacts_details(DataTable dealData){
			 for (Map<String, String> data : dealData.asMaps()){
			 driver.findElement(By.id("title")).sendKeys(data.get("title"));
			 driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			 driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			 driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
		    //move to new deal page:
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(By.xpath("//a[@title='Deals']"))).build().perform();
			 driver.findElement(By.xpath("//a[@title='New Deal']")).click();
			 }
		 }
		
		@Then("^Close the browser$")
		public void Close_the_browser()  {
		   driver.quit();
		}

}
*/