package week5.Week5day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		WebElement ShopByCat = driver.findElement(By.xpath("(//button[contains(@id,'headlessui-menu-button')])[4]"));
		ShopByCat.click();
		
		Thread.sleep(1000);
		WebElement foodgrainsMO = driver.findElement(By.xpath("//a[@role='none'][normalize-space()='Foodgrains, Oil & Masala']"));
		Actions fgmouse = new Actions(driver);
		fgmouse.moveToElement(foodgrainsMO).perform();
		
		
		WebElement riceprodMO = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		Actions riceMouse = new Actions(driver);
		riceMouse.moveToElement(riceprodMO).perform();
		
		WebElement boiledSteamedRice = driver.findElement(By.xpath("//a[normalize-space()='Boiled & Steam Rice']"));
		boiledSteamedRice.click();
		
		WebElement bbRoyal = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
		bbRoyal.click();
		
		Thread.sleep(1000);

		WebElement kgSelbutton = driver.findElement(By.xpath("//div[@id='headlessui-listbox-button-:r6k:']//button"));
		kgSelbutton.click();
		
		String price = driver.findElement(By.xpath("//span[text()='₹425']")).getText();
		System.out.println("Price of 5kg Rice Bag : " +price);
		
		WebElement Sel5kg = driver.findElement(By.xpath("(//div[@class='flex justify-between'])[3]"));
		Sel5kg.click();
		
		WebElement clickAdd = driver.findElement(By.xpath("//button[text()='Add']"));
		clickAdd.click();
		
		String msg = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println(msg);
		
		driver.close();
		
	}

}
