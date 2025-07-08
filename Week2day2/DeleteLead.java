package week2.Week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("testleafangel@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.or(
		    ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")),
		    ExpectedConditions.presenceOfElementLocated(By.className("x-paging-info"))
		));
		
		WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadId = lead.getText();
		System.out.println(leadId);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.id("ext-gen341")).click();
		Thread.sleep(3000);
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("x-paging-info")));
		String message = driver.findElement(By.className("x-paging-info")).getText();
		if (message.trim().equalsIgnoreCase("No records to display")) 
		{
			System.out.println("ID is deleted Successfully");
		}
		else 
		{
			System.out.println("ID is not deleted");
		}
		
		driver.close();
	}

}
