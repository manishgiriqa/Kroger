
package Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
	
	public static WebDriver getDriver(String browserName)
	{
		if(browserName.toUpperCase().equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/apekshasahu/eclipse-workspace/Kroger/resources/chromedriver");
			driver = new ChromeDriver();
		}
		if(browserName.toUpperCase().equals("IE")) {}
		return driver;
	}

}
