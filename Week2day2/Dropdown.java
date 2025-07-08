package week2.Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Angeline");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joyce");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(sourceDD);
		sel.selectByVisibleText("Employee");
		
		WebElement MarktCampDD= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(MarktCampDD);
		sel1.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement OwnerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel2 = new Select(OwnerDD);
		sel2.selectByIndex(5);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();

	}

}




