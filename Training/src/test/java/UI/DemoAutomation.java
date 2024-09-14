//Importing required libraries
package UI;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

public class DemoAutomation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		//ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

}
