package expertittutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wesitepractise {

	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.gecko.driver","/Users/Sandesh/Downloads/geckodriver");
	driver = new FirefoxDriver();

	        // And now use this to visit Google
	  driver.get("http://www.fox.com");
	        // And now use this to visit Google
	

	
}
}