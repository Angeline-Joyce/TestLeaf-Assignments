package week2.Week2day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountSelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestLeafChennai");
		
		//select Computer Software from industryDD using selectByValue
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
	    Select DD1 = new Select(IndustryDD);
	    DD1.selectByValue("IND_SOFTWARE");
	    
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
	    //Select "S-Corporation" as ownership using SelectByVisibleText
	    WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	    Select DD2 = new Select(ownershipDD);
	    DD2.selectByVisibleText("S-Corporation");
	    
	    //Select "Employee" as the source using SelectByValue.
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	    Select DD3 = new Select(sourceDD);
	    DD3.selectByValue("LEAD_EMPLOYEE");
	    
	    //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	    WebElement MarktDD = driver.findElement(By.id("marketingCampaignId"));
	    Select DD4 = new Select(MarktDD);
	    DD4.selectByIndex(6);
	    
	    //Select "Texas" as the state/province using SelectByValue. 
	    WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select DD5 = new Select(stateDD);
	    DD5.selectByValue("TX");
	    
	    //Click the "Create Account" button.
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    driver.findElement(By.className("buttonDangerous")).click();
	    
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept(); 
	    
	    WebElement AccName = driver.findElement(By.xpath("//span[contains(text(),'TestLeafChennai')]"));
	    
	    //Verify that the account name is displayed correctly. 
	    if(AccName.isDisplayed()) {
	    	System.out.println("AccountName is displayed");
	    	String actualname = AccName.getText();
	    	System.out.println(actualname);
	    	String expectedname = "TestLeafChennai  (14921)";
	    	
	    	if(actualname.contains(expectedname)) {
	    		System.out.println("AccountName is displayed correctly");
	    	}
	    		else {
	    		System.out.println("AccountName is incorrect");
	    	}}
	    	else {
	    		System.out.println("AccountName is not displayed");
	    	}
	    
	    Thread.sleep(5000);
	    driver.close();
	    

	}

}
