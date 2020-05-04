package pack99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Launch456 {
	WebDriver driver;
  @Test(priority=1)
  public void register() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.linkText("Register")).click();
	  driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
	  driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("srini");
	  driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("godari");
	  driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("testuyt@test132.com");
	  driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password123");
	  driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Password123");
	  driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	
  }
  @Test(priority=3)
  public void login() {
	  System.out.println("code for login");
	  Assert.assertEquals("Srinivas",driver.getTitle());
  }
  @Test (priority=2)
  public void logout() {
	  System.out.println("code for logout");
  }
}
