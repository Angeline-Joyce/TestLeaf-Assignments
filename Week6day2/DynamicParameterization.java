package week6.Week6day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DynamicParameterization {
	ChromeDriver driver;
	ChromeOptions options;
	
	@DataProvider(name="dp")
	String[][] loginData() {
		String[][] data= {{"bhuvanesh.moorthy@testleaf.com","Leaf@2025"},
							{"angelinejoyce@testleaf.com","Joy@2025"},
							  {"vidhyar@testleaf.com","vidya@2025"},
							    {"harish@testleaf.com","harish@2025"}};
		return data;
	}
	
	@Test(dataProvider="dp")
	public void loginSalesForce(String Uname, String Pwd) throws InterruptedException {
		
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Uname);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pwd);
		
		WebElement loginButton = driver.findElement(By.xpath("(//input[@id='Login'])[1]"));
		loginButton.click();
		
		WebElement toggleMenuButton = driver.findElement(By.xpath("//div[@class='slds-r4']"));
		toggleMenuButton.click();
		
		Thread.sleep(5000);
		
		WebElement viewAllButton = driver.findElement(By.xpath("//button[text()='View All']"));
		viewAllButton.click();
		
		Thread.sleep(5000);
		
		WebElement legalEntityButton = driver.findElement(By.xpath("//p[normalize-space()='Legal Entities']"));
		Actions legal = new Actions(driver);
		legal.scrollToElement(legalEntityButton).perform();
		legalEntityButton.click();
		
		WebElement newButton = driver.findElement(By.xpath("//a[@title='New']"));
		newButton.click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Ajoyce");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		Thread.sleep(2000);
		WebElement status = driver.findElement(By.xpath("//button[@data-value='--None--']"));
		driver.executeScript("arguments[0].click();", status);
		
		WebElement Active = driver.findElement(By.xpath("//span[text()='Active']"));
		Active.click();
		
		WebElement savebutton = driver.findElement(By.xpath("//button[text()='Save']"));
		savebutton.click();
		
		WebElement msg = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']"));
		System.out.println("Displayed message : "+ msg.getText());
		
		driver.close();
	}
	
	
	
		
	
}
