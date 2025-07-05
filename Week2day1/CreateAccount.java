package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
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
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//selecting general services from industryDD using selectByValue
		WebElement IndustryDD = driver.findElement(By.name("industryEnumId"));
	    Select sel = new Select(IndustryDD);
	    sel.selectByValue("IND_GEN_SERVICES");
	    
	    driver.findElement(By.id("numberEmployees")).sendKeys("50");
	    
	    //selecting Initial Team using selectByIndex
	    WebElement TeamDD = driver.findElement(By.id("initialTeamPartyId"));
	    Select sel1 = new Select(TeamDD);
	    sel1.selectByIndex(1);
		
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.close();
	}

}
