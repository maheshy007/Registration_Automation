package rahulshettyacademy.Registrationform;

// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationForm {

	public static void main(String[] args) {
			
	//	WebDriver driver = 	WebDriverManager.chromedriver().create();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koolm\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\koolm\\Documents\\geckodriver-v0.33.0-win64\\driver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\koolm\\Documents\\edgedriver_win64\\msedgedriver.exe");
	//	WebDriver driver = new EdgeDriver();
		
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	// sending text in input text 
	driver.findElement(By.name("name")).sendKeys("Mahesh");
	driver.findElement(By.name("email")).sendKeys("koolmahesh007@gmail.com");
	driver.findElement(By.id("exampleInputPassword1")).sendKeys("Mahesh");
	
	// for checkout 
	driver.findElement(By.id("exampleCheck1")).click();
	
	// for static Selection drop down
	WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));

	Select dropdown = new Select(staticdropdown);
	dropdown.selectByIndex(1);
	System.out.println(	dropdown.getFirstSelectedOption().getText());
	
	// For Radio button
	
	driver.findElement(By.id("inlineRadio1")).click();
	
	// calendar click
	driver.findElement(By.name("bday")).sendKeys("13/10/1997");

	
	driver.findElement(By.cssSelector(".btn-success")).click();
	
	System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

	
	// driver.close();
	
	
	}

}
