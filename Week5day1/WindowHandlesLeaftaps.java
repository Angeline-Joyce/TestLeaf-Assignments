package week5.Week5day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlesLeaftaps {

	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		WebElement contacts = driver.findElement(By.xpath("//a[text()='Contacts']"));
		contacts.click();
		
		WebElement MergeContacts = driver.findElement(By.xpath("//a[text()='Merge Contacts']"));
		MergeContacts.click();
		
		WebElement fromWidget = driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]"));
		fromWidget.click();
		
		Set<String> firstswitch = driver.getWindowHandles();
		List<String> fs = new ArrayList<String>(firstswitch);
		driver.switchTo().window(fs.get(1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		driver.switchTo().window(fs.get(0));
		
		WebElement toWidget = driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		toWidget.click();
		
		Set<String> secondSwitch = driver.getWindowHandles();
		List<String> ss = new ArrayList<String>(secondSwitch);
		driver.switchTo().window(ss.get(1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='DemoPrivilegedCust']")).click();

		driver.switchTo().window(ss.get(0));
		Thread.sleep(1000);

		WebElement merge = driver.findElement(By.xpath("//a[text()='Merge']"));
		merge.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
		

	}

}
