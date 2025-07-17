package week4.Week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@aria-label='Search Ajio']"));
		searchBar.sendKeys("bags",Keys.ENTER);
		
		WebElement menCheckBox = driver.findElement(By.xpath("//label[text()='Men (9,051)']"));
		menCheckBox.click();
		
		WebElement fashionbagCheckBox = driver.findElement(By.xpath("//label[text()='Fashion Bags (1,284)']"));
		fashionbagCheckBox.click();
		
		WebElement countOfItems = driver.findElement(By.xpath("//div[@aria-label='1,284 Items Found']"));
		System.out.println(countOfItems.getText());
		
		//IN-COMPLETE - ajio site issue;
	}

}
