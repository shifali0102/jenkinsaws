package in.javahome.myweb.controller;
import java.io.IOException;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.chrome.ChromeDriver;
	import junit.framework.TestCase;
	import junit.framework.Assert;

	public class TecAdminSeleniumTestIT extends TestCase {
	 
		Calculator cal = new Calculator();
	        public static void main(String[] args) throws IOException, InterruptedException {
	                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	                ChromeOptions chromeOptions = new ChromeOptions();
	                chromeOptions.addArguments("--headless");
	                chromeOptions.addArguments("--no-sandbox");
	 
	                WebDriver driver = new ChromeDriver(chromeOptions);
	 
	                driver.get("https://google.com");
	 
	                Thread.sleep(1000);
	 
	                if (driver.getPageSource().contains("I'm Feeling Lucky")) {
	                        System.out.println("Pass");
	                } else {
	                        System.out.println("Fail");
	                }
	                driver.quit();
	        }
		
		public void testMultiply() {
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
	}
