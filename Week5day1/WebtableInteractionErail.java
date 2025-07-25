package week5.Week5day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableInteractionErail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationTo")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);

		WebElement sortondate = driver.findElement(By.id("chkSelectDateOnly"));
		if(sortondate.isSelected()) {
			sortondate.click();
		}
		
		driver.findElement(By.xpath("//table[contains(@class,'stickyTrainListHeader')]/tbody"));
		
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@class,'stickyTrainListHeader')]/tbody/tr/th"));
		int rowsize = row.size();
		System.out.println("Num of col in each row :"+ rowsize);
		
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class,'stickyTrainListHeader')]/tbody/tr/td[2]"));
		int colsize = col.size();
		System.out.println("Num of trains available : "+ colsize);
		
		System.out.println("--------------------------");
		
		for (WebElement trainNames : col) {
			System.out.println(trainNames.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
