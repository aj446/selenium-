package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//Open Gmail app
		driver.get("http:/www.gmail.com");
		driver.manage().deleteAllCookies();
		//maximises the window
		driver.manage().window().maximize();
		//waits for 5 seconds
		Thread.sleep(5000);
	driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("next")).click();
	
		//String s=driver.getTitle();
		//System.out.println(s);
		

	}

}
