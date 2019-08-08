package TestCases;

import org.testng.annotations.Test;
import Library.BaseClass;
import PageObjects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SignOnTest {
	
	WebDriver driver;
	@BeforeTest
	public void executeBeforeTest()
	{
		this.driver = BaseClass.getDriver("chrome");
		System.out.println("****Starting new test case*****");
		driver.get("http://newtours.demoaut.com/index.php");
	}

	@Test(groups= {"NewCustomer"})
	public void ShowSignOnPage() {
		
		HomePage homePage = new HomePage(driver);
		homePage.clickSignOn();
		}
	
	@AfterTest
	public void executeAfterTest()
	{
		//driver.close();
		System.out.println("*****End of test case*****");
	}
	

}
