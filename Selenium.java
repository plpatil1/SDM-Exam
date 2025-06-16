import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
 
public static void main(String[] args) {
	
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://www.saucedemo.com/"); //launch the edge browser on https://www.saucedemo.com/"
	
	WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	
	WebElement password = driver.findElement(By.id("password"));
	
	WebElement LoginButton = driver.findElement(By.name("login-button"));
	
	
	username.sendKeys("plpatil1151@gmail.com");
	
	password.sendKeys("secret_sauce");
	
	LoginButton.click();
	
	
	
	
	
	
}
}
