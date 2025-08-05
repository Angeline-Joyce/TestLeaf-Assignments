package Marathon4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class baseClass {
	public static ChromeDriver driver;
	public static ChromeOptions options;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void base(String URL, String Uname, String Pwrd) throws InterruptedException {
		options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(Uname);
        driver.findElement(By.id("password")).sendKeys(Pwrd);
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/div[5]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p[text()='Sales']")).click();
        WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click()",accountsTab);
	}
	
	@DataProvider(name="dp")
	public String[][] senddata() throws IOException{
		return logindata.readdata();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
