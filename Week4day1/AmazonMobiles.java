package week4.Week4day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobiles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("mobile phones");

		WebElement submitbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		submitbutton.click();
		
		List<WebElement> allprice = driver.findElements(By.className("a-price-whole"));
		int size = allprice.size();
		System.out.println(size);
		
		List<String> pricelist = new ArrayList<String>();
		for (WebElement eachprice : allprice) {
			String text = eachprice.getText();
			pricelist.add(text);
		}
		System.out.println(pricelist);
		driver.close();
		

	}

}
