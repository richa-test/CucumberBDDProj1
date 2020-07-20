/*package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class loginStepDefinition {
	WebDriver  driver;
	
	@Given("^User is already on Login Page$")
	public void User_is_already_on_Login_Page() throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
				"\\browserdrivers\\chromedriver_win32V83\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\79.0.3945.88_chrome_installer.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   // driver.wait(10);
		   driver.get("https://classic.crmpro.com/index.html?e=1");
	}

	@When("^title of page is Free CRM$")
	public void title_of_page_is_Free_CRM()  {
		String title=driver.getTitle();
		String expectedtitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
		System.out.println("title of login page is "+title);
		Assert.assertEquals(expectedtitle, title);
			}

	//@Then("^Then user provides login credentials \"(.*)\" and \"(.*)\"$")
	@Then("^user provides login credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_provides_username_and_user_provides_password(String username,String password )  {
		//String username="crmseltest";
		//String password="test@123";
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(password);
	}

	@Then("^user clicks login button$")
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
	

}*/
