package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser {

	public static void main(String[] args) {
		
		//1st
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//load url
		driver.get("https://in.bookmyshow.com/");
//
//		driver.findElement(By.id("username")).sendKeys("DemoCsr");
//		
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		
//		driver.findElement(By.className("decorativeSubmit")).click();
//		
//		driver.findElement(By.linkText("CRM/SFA")).click();
		
			
	}

}
