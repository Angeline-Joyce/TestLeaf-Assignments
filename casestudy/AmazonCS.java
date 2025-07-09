package week2.casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCS {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("Roadster T-Shirt");

		WebElement submitbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		submitbutton.click();

		WebElement selectfirstprod = driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal'][1]"));
		selectfirstprod.click();

		WebElement size = driver.findElement(By.xpath("//input[@aria-labelledby='size_name_0-announce']"));
		size.click();
		Thread.sleep(2000);

		WebElement seeallbuyngOption = driver.findElement(By.xpath("//a[text()=' See All Buying Options ']"));
		seeallbuyngOption.click();
		Thread.sleep(2000);

		WebElement clickATC = driver.findElement(By.xpath("//input[@name='submit.addToCart']"));
		clickATC.click();
		Thread.sleep(2000);

		WebElement dismiss = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		dismiss.click();
		Thread.sleep(2000);

		WebElement addToCart = driver.findElement(By.xpath("//h1[contains(text(),'Added to cart')]"));
		addToCart.isDisplayed();
		String atc = addToCart.getText();
		System.out.println(atc);

		driver.close();
		}

}
