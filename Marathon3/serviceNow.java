package Marathon3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.sukgu.Shadow;

public class serviceNow {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev209663.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("qy/Q6A=vOM3x");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
		WebElement iframe = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		shadow.findElementByXPath("//h2[text()='Apple iPhone 13 pro']").click();
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		driver.findElement(By.xpath("(//select[contains(@class,'form-control')])[1]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'cat_item_option')])[4]")).sendKeys("99");
		driver.findElement(By.xpath("//option[contains(text(),'Unlimited')]")).click();
		
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'512')]")).click();
		driver.findElement(By.xpath("//button[text()='Order Now']")).click();
		
		String reqNum = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request Number : " + reqNum);

		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/serviceNow.png");
		FileHandler.copy(source, dest);
		
		driver.close();
		
	}

}
