package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0npld7klal65a1bm6selypyuqd207395.node0");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	      driver.switchTo().alert().accept();
	      String simpleAlert = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
	      System.out.println(simpleAlert);
	      driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	      driver.switchTo().alert().accept();
	      String confirmAlert = driver.findElement(By.xpath("//span[@id='result']")).getText();
	      System.out.println(confirmAlert);
	      driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	      driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	      driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following::span")).click();
	      driver.findElement(By.xpath("//span[text()='Delete']")).click();
	      driver.findElement(By.xpath("//span[text()='Yes']")).click();
	      driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	      driver.switchTo().alert().sendKeys("Subraja");
	      driver.switchTo().alert().accept();
	      String promptALert = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	      System.out.println(promptALert);
	      driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[contains(@class,'ui-dialog-titlebar-icon ui-dialog-titlebar-minimize')]//span")).click();
	      System.out.println(driver.getTitle());
	      
	      driver.close();
	}

}
