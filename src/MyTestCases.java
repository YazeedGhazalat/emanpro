
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters {

	@BeforeTest
	public void myBeforeTest() {
		driver.get(URl);
	}

	@Test()
	public void check_the_website_default_currency() throws InterruptedException {

	
		  WebElement currency = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
		    String defaultCurrency = currency.getText();
		    System.out.println(defaultCurrency);
		    String Expected="SAR";
		    myAssertion.assertEquals(defaultCurrency, Expected, "Default currency is matched");
		    //Thread.sleep(2000);
		  
		    
		}
	
	@Test()
	public void testContactSupport() {
	    WebElement SupportElement = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[2]/div/div/div/div/div[2]/div[3]/div/h4/a"));
	    String supportNumber = SupportElement.getText();
	    System.out.println(supportNumber);
	    String ExpectedNum="+966 55 440 0000";
	    myAssertion.assertEquals(supportNumber, ExpectedNum, "support number is matched");
	}
	@Test()
	public void testContactNumbers() {
	    WebElement ContactUsElement = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[2]/div/div/div/div/div[2]/div[1]/div/h4"));
	    String  ContactUsNumber = ContactUsElement.getText();
	    System.out.println(ContactUsNumber);
	    String ExpectedN="920000997";
	    myAssertion.assertEquals(ContactUsNumber, ExpectedN, " contact number is matched");
	  }
		
 

	@AfterTest
	public void myAfterTest() {
		myAssertion.assertAll();
		

	}

}
