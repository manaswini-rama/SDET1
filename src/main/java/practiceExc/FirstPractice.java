package practiceExc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
				driver.get("http://qdpm.net/demo/v9/index.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				//Verify Page Title
				
				String Expectedpagetitle = "“qdPM } Login”";
				
				String Actualpagetitle = driver.getTitle();
				
				if(Expectedpagetitle.equalsIgnoreCase(Actualpagetitle))
				{
					System.out.println("Expected and Actual Titles are same");
				}

				else
				{
					System.out.println("Expected and Actual Titles are not same");
				}

				//Verify Page URL
				
				String ActualURL = driver.getCurrentUrl();
				String ExpectedURL = "http://qdpm.net/demo/v9/index.php";
				
				if(ExpectedURL.equalsIgnoreCase(ActualURL))
				{
					System.out.println("Expected and Actual URLs are same");
				}
				
				else
				{
					System.out.println("Expected and Actual URLs are not same");
				}

		}
							
	}


