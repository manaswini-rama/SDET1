package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				
				String Expectedpagetitle = "google";
				
				String Actualpagetitle = driver.getTitle();
				
				if(Expectedpagetitle.equalsIgnoreCase(Actualpagetitle))
				{System.out.println("Test Case Passed");
				}

				else
				{System.out.println("Test Case failed");
				}


	}

}
