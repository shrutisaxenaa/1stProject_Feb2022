
package variousConcepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		//Set Property
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shrut\\eclipse-selenium\\1st_Selenium\\drivers\\chromedriver.exe");
		
		//Creation of Object 
		WebDriver driver=new ChromeDriver();
		
		//go to web site
		driver.get("https://www.youtube.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Stop Execution
		Thread.sleep(5000);//taking 5 second to close the browser
		
		//Close Browser
		driver.close();
		
		
		
		
	}
}
