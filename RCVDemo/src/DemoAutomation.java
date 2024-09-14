//Importing required libraries
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

}
