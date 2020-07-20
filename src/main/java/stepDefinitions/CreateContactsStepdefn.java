package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContactsStepdefn {
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

	//@Then("^Then user provides login credentials \"(.*)\" and \"(.*)\"$")
	//@Then("^user provides login credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	//public void user_provides_username_and_user_provides_password(String username,String password )
@Then("^user provides login credentials username and password$")
	public void user_provides_username_and_password()
	  {
		String username="crmseltest";
		String password="test@123";
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(password);
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
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page()  {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details(String firstname, String lastname, String position) throws IOException{
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		
		String FilePath = System.getProperty("user.dir")
				+ "\\src\\main\\resources\\screenshot";
        Path path = Paths.get(FilePath+"\\NewContacts");
        //if directory exists?
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                //fail to create directory
                e.printStackTrace();
            }
        }
	String fileSuffix = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());       
	String fileWithPath=FilePath+"\\NewContacts"+"\\NewContact_"+fileSuffix+".jpg";
	 TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	            //Move image file to new destination
	                File DestFile=new File(fileWithPath);
	                //Copy file at destination
	                FileUtils.copyFile(SrcFile, DestFile);
		
		
	}

	@Then("^Close the browser$")
	public void Close_the_browser()  {
	   driver.quit();
	}


}

