package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http:/www.google.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  String actres= driver.getTitle();
  System.out.println(actres);
  driver.findElement(By.id("q")).sendKeys("webdriver");
 
	
}
}
