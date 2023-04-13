

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
	
	WebDriver driver = new ChromeDriver(); 
	
	SoftAssert myAssertion = new SoftAssert(); 
	
	
	static String URl = "https://www.almosafer.com/en";
	
	Date today = new Date();

}
