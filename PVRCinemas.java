package week2.casestudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement locationDD = driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']"));
		locationDD.click();
		
		WebElement selectchennai = driver.findElement(By.xpath("(//div[contains(@class,'cities-overlay')])[6]"));
		selectchennai.click();
		
		WebElement clickCinema = driver.findElement(By.xpath("//span[text()='Cinema']"));
		clickCinema.click();
		
		WebElement selectCinema = driver.findElement(By.xpath("//span[text()='Select Cinema']"));
		selectCinema.click();
		
		WebElement selecttheatre = driver.findElement(By.xpath("//span[contains(text(),'Escape-Express')]"));
		selecttheatre.click();
		Thread.sleep(2000);
		
		WebElement selecttmrwdate = driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']//span)[2]"));
		selecttmrwdate.click();
		Thread.sleep(2000);
		
		WebElement selectsuperman = driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//span"));
		selectsuperman.click();
		Thread.sleep(2000);
		
		WebElement selectmovietime = driver.findElement(By.xpath("(//span[text()='English'])[3]"));
		selectmovietime.click();
		Thread.sleep(2000);

		WebElement bookbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		bookbutton.click();
		
		WebElement acceptbutton = driver.findElement(By.xpath("//button[text()='Accept']"));
		acceptbutton.click();
		
		WebElement selectseat = driver.findElement(By.xpath("//span[@id='BU.BUDGET|P:10']"));
		selectseat.click();
		
		String seatnum = driver.findElement(By.xpath("//p[text()='P10']/parent::div")).getText();
		System.out.println("Seat Number : " + seatnum);
		
		String grandtotal = driver.findElement(By.xpath("//h6[text()='130.64']")).getText();
		System.out.println("Grand Total : " + grandtotal);
		
		WebElement proceedbutton = driver.findElement(By.xpath("//button[text()='Proceed']"));
		proceedbutton.click();
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
