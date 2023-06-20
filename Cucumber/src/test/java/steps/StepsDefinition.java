package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition   {

	public RemoteWebDriver driver;
	
	@Given ("Launch Browser {string} and load the Url and maximize Screen")
	public void launchUrl(String browser) {
		if(browser.equals("Chrome")) {
		 driver  = new ChromeDriver();
		}else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@And ("Enter the username as (.*)$")
	public void enterUsername(String user) {
		driver.findElement(By.id("username")).sendKeys(user);

	}


	@And ("Enter the password as (.*)$")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@When ("Click on LoginButton")
	public void login() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@Then ("Verify my page successfully login")
	public void verifyPage() {
		String title = driver.getTitle();
		
		if(title.contains("Leaftaps")) {
			System.out.println("login is successful");
		}else {
			System.out.println("not successful");
		}
		
	}
	
	
	@But ("Verify my page not successfully login")
	public void verifypagenotlogin() {
String title = driver.getTitle();
		
		if(title.contains("Leaftaps")) {
			System.out.println(" not login is successful");
		}else {
			System.out.println("not successful");
		}
	}
	

	
}
