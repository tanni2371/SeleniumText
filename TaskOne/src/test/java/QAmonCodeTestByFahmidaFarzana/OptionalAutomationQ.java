package QAmonCodeTestByFahmidaFarzana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionalAutomationQ {
	
	//Main Method Create
	public static void main(String[] args) throws InterruptedException{
		
		//Use the webdriverManager denpendency
		WebDriverManager.chromedriver().setup();
		
		//Webdriver object create
		WebDriver driver= new ChromeDriver();
		
		//visit the URL
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		
		//Fill up the Email for create account
	    driver.findElement(By.id("email_create")).sendKeys("abc@yopmail.com");
	    
	  //Click on the "create account" button.
	  driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
	  

		
		//sign up
		
		//title
		//driver.findElement(By.id("id_gender1")).click();
		
		//personal information
		driver.findElement(By.id("customer_firstname")).sendKeys("maxwell");
		driver.findElement(By.id("customer_lastname")).sendKeys("amell");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		//date of birth
		
//		
//		//sign up for news letter
//	    driver.findElement(By.id("uniform-optin")).click();
//	    
//	    
//	    //address
//	    driver.findElement(By.id("firstname")).sendKeys("maxwell");
//		driver.findElement(By.id("lastname")).sendKeys("amell");
//		
//		//company
//		driver.findElement(By.id("company")).sendKeys("Itech");
//		driver.findElement(By.id("address1")).sendKeys("KDA Avenue");
//		driver.findElement(By.id("address2")).sendKeys("16 KDA avenue");
//		driver.findElement(By.id("city")).sendKeys("Khulna");
//		
		//state 

//		// select method use
//		Select dropdownbox=new Select(driver.findElement(By.id("id_state")));
//				
//				
//		dropdownbox.selectByVisibleText("South Dakota");
//				
//				//Thread.sleep(2000);
//		
//		//zip code
//		driver.findElement(By.id("postcode")).sendKeys("9100");
//		
//		//country
//		
//		
//		//additional info
//		driver.findElement(By.id("other")).sendKeys("additional info");
//		
//		//home phone, mobile phone
//		driver.findElement(By.id("phone")).sendKeys("174856");
//		driver.findElement(By.id("phone_mobile")).sendKeys("0171689776");
//		
//		//future reference
//		driver.findElement(By.id("alias")).sendKeys("Referecne");
		
		}
		
		
		
		
	}

