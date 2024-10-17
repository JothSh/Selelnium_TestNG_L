package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	/* Open chrome go to google and next go to yahoo and bing */
	@BeforeSuite
	
	public void lanchBrowser() {
	 driver = new ChromeDriver();
     startTime = System.currentTimeMillis();
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in/");
		
	}
	@Test
    public void openYahoo() {
    	driver.get("https://www.yahoo.co.in/");
    }
	@Test
    public void openBing() {
		driver.get("https://www.bing.co.in/");
    	
    }

    @AfterSuite
    public void closeBrowser() {
	driver.quit();
	endTime = System.currentTimeMillis();
	long totalTime = endTime-startTime ;
	System.out.println("Total Time Taken ="+totalTime);
    }


}



