package pagesSF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseSF.BaseClassSF;

public class T2_HomeSF extends BaseClassSF {
	
	public T2_HomeSF Applauncher() throws InterruptedException {
		WebElement toggleMenuButton = driver.findElement(By.xpath("//div[@class='slds-r4']"));
		toggleMenuButton.click();
		Thread.sleep(3000);
		return this;
	}
	
	public T2_HomeSF ViewAll() throws InterruptedException {
		WebElement viewAllButton = driver.findElement(By.xpath("//button[text()='View All']"));
		driver.executeScript("arguments[0].click()", viewAllButton);
		Thread.sleep(3000);
		return this;
	}
	
	public T3_Sales Sales() throws InterruptedException {
		WebElement clickSales = driver.findElement(By.xpath("//p[text()='Sales']"));
		clickSales.click();
		Thread.sleep(3000);
		return new T3_Sales();
	}

}
