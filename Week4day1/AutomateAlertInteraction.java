package week4.Week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlertInteraction {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement promptShowButton = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		promptShowButton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Prompt Button CLicked");
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		alert.dismiss();
		
		WebElement result = driver.findElement(By.xpath("//span[@id='confirm_result']"));
		System.out.println("Alert message displayed : " + result.getText());
	}
}
