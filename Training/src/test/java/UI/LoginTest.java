package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//launch the browser
		driver.get("https://saucedemo.com/");
		
		//enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		
		//driver.close();
	}

}
