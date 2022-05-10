package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//represents dependency
		// setup represents the browser
		
		ChromeDriver driver=new ChromeDriver();
		//represents the browser
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		// get is used to use the URL
		
		driver.manage().window().maximize();
		// to maximise the browser window

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// findelement(search) ... by id(id is format which is in inspect) ... 
		//	sendkeys (user value)
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// findelement(search) ... by id(id is format which is in inspect) ... 
		//	sendkeys (user value)

		driver.findElement(By.className("decorativeSubmit")).click();
		// findelement(search) ...
		// classname(classname is format which is in inspect as class) ...
		//click(because login is to click no sending values)
	
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//gettext function  
		//text link and print it ... h2 is a location by inspect
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		// to click the CRM/SFA in browser
		
		String title = driver.getTitle();
		System.out.println(title);
		//user knowledge but nothing happens
		
		driver.findElement(By.linkText("Leads")).click();
		// to click the leads TAB in browser
		
		driver.findElement(By.linkText("Create Lead")).click();
		// to click the create leads TAB in browser
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		//send the values to box (user value)
		
		
	}
	
	}

