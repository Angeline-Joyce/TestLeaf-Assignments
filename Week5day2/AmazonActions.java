package week5.Week5day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("oneplus 9 pro mobile",Keys.ENTER);
		
		String firstProdPrice = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText();
		System.out.println("First Product Price : " + firstProdPrice);
		
		String firstProdRating = driver.findElement(By.xpath("(//i[@data-cy='reviews-ratings-slot'])[1]/span")).getText();
		System.out.println("First Product Rating : " + firstProdRating);
		
		WebElement firstProdTextLink = driver.findElement(By.xpath("(//div[@class=\"aok-relative\"]//a[@class='a-link-normal s-no-outline'])[1]"));
		firstProdTextLink.click();
		
		Thread.sleep(2000);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/oneplus.png");
		FileHandler.copy(source, dest);

		WebElement addToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCart.click();
		
		Thread.sleep(2000);

		String subTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Subtotal is :" + subTotal);
		
		if(firstProdPrice.equals(subTotal)) {
			System.out.println("Subtotal is correct");
		}
		else {
			System.out.println("Subtotal is In-correct");
		}
		
		driver.close();
	
	}

}
