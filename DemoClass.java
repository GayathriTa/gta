package demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String exp_title = "Your Store";
		
		//open browser
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\chrome42\\chromedriver.exe");
		driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		//open aplication
		driver.get("https://demo.opencart.com/");

		//get the title and compare
		String actul_title = driver.getTitle();
		if(actul_title.equals(exp_title)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		//to get the current url
		System.out.println("Current url is "+driver.getCurrentUrl());
		
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	if(pagesource.contains(exp_title)) {
		System.out.println("Test Pass");
	}else {
		System.out.println("Test Fail");
	}
	driver.navigate().to("https://www.seleniumhq.org/projects/webdriver/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
		// to close browser
		driver.close();
		
	}

}
