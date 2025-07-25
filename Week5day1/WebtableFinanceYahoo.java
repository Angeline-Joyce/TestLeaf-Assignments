package week5.Week5day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebtableFinanceYahoo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://finance.yahoo.com/");
		
		WebElement market = driver.findElement(By.xpath("//span[text()='Markets']"));
		
		Actions mouseHoverMarket = new Actions(driver);
		mouseHoverMarket.moveToElement(market).perform();
		
		WebElement crypto = driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"));
		crypto.click();
		
		List<WebElement> cryptoNames = driver.findElements(By.xpath("//table[@class='yf-ao6als bd']/tbody/tr/td[2]"));
		for (WebElement names : cryptoNames) {
			System.out.println(names.getText());
		}
		}
	
		
	}


