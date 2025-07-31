package Marathon3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tataCliq {

	public static void main(String[] args) throws IOException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.tatacliq.com/");
		 
		 WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		 Actions brandMO = new Actions(driver);
		 brandMO.moveToElement(brands).perform();
		 
		 WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		 Actions watchMO = new Actions(driver);
		 watchMO.moveToElement(watches).perform();
		 
	 	 WebElement casio = driver.findElement(By.xpath("//div[text()='Casio']"));
	 	 casio.click();
	 	 
	 	 WebElement newArrival = driver.findElement(By.xpath("//option[text()='New Arrivals']"));
	 	 newArrival.click();
	 	 
	 	 WebElement men = driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]"));
	 	 men.click();
	 	 
	 	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ProductDescription__priceHolder']//h3")));
	 	 
	 	 List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
	 	 System.out.println("Size of pricelist : "+ priceList.size());
	 	 
	 	 System.out.println("---------------------------------");
	 	 
	 	 for (WebElement prodprice : priceList) {
			String price = prodprice.getText();
			System.out.println(price);
		 }	 	 
	 	 
	 	 WebElement firstProd = driver.findElement(By.xpath("(//a[@aria-label='Casio'])[1]"));
	 	 firstProd.click();
	 	 
	 	 Set<String> windowHandles = driver.getWindowHandles();
	 	 List<String> casioProd = new ArrayList<String>(windowHandles);
	 	 driver.switchTo().window(casioProd.get(1));
	 	 
	 	 System.out.println("---------------------------------");
	 	 
	 	 WebElement firstProdPrice = driver.findElement(By.xpath("//h3[contains(text(),'MRP:  ₹3995')]"));
	 	 System.out.println("Price of the first element : " + firstProdPrice.getText());
	 	 
	 	 WebElement addToBag = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
	 	 addToBag.click();
	 	 
	 	 System.out.println("---------------------------------");
	 	 
	 	 String msg = driver.findElement(By.xpath("//div[text()='The item has been added to your bag']")).getText();
	 	 System.out.println("Displayed Msg : " + msg);
	 	 
	 	 System.out.println("---------------------------------");
	 	 
	 	 WebElement cartItems = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
	 	 System.out.println("Num of Items in cart : " + cartItems.getText());
	 	 
	 	 System.out.println("---------------------------------");

	 	 WebElement ShopngCart = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
	 	 ShopngCart.click();
	 	 
	 	 WebElement totalcartprice = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']"));
	 	 System.out.println("Total Cart Price : " + totalcartprice.getText());
	 	 
	 	 File source = driver.getScreenshotAs(OutputType.FILE);
	 	 File dest = new File("./screenshots/tataCliq.png");
	 	 FileHandler.copy(source, dest);
	 	 
	 	 driver.close();
	 	 driver.switchTo().window(casioProd.get(0));
	 	 driver.close();
	}

}
