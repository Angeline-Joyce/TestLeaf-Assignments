package week2.Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("AngelineJoyce");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Angeline");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Joyce");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Joy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("IT is a growing sector");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("itsector@gmail.com");
		
		WebElement StateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select DD1 = new Select(StateDD);
		DD1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Information Technology");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		


	}

}
