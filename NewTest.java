import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver = null;
	
	
	
	
  @Test
  public void f()  {
	  
		  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahil.mohammad\\Downloads\\ChromeDriver122\\ChromeDriver122\\chromedriver.exe");
	  

	 
	   WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://www.google.com/");    
	  
	  driver.manage().window().maximize();

	  
	  //Please add the wait commands 

	   
	 
  }
  }
  
 
