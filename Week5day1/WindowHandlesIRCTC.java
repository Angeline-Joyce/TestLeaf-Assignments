package week5.Week5day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesIRCTC {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		WebElement alertbutton = driver.findElement(By.xpath("//button[text()='OK']"));
		alertbutton.click();
		
		WebElement flights = driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]"));
		flights.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowlist.get(1));
		System.out.println("Child Window : " + driver.getTitle());
		
		driver.switchTo().window(windowlist.get(0));
		System.out.println("Parent Window : " + driver.getTitle());
		
		driver.close();
	}

}
