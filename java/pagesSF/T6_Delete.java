package pagesSF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseSF.BaseClassSF;

public class T6_Delete extends BaseClassSF {
	
	public T6_Delete delSearch() throws InterruptedException {
		WebElement clickAccounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click()", clickAccounts);
		Thread.sleep(5000);
		WebElement delsearchBox = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
		delsearchBox.clear();
		delsearchBox.sendKeys("Joy",Keys.ENTER);
		Thread.sleep(5000);
		return this;
	}
	
	public T6_Delete actions() throws InterruptedException {
		WebElement delshowOptions = driver.findElement(By.xpath("//span[text()='Show Actions']"));
		driver.executeScript("arguments[0].click()", delshowOptions);
		Thread.sleep(5000);
		return this;
	}
	
	public T6_Delete delDD() throws InterruptedException {
		WebElement clickDeleteDD = driver.findElement(By.xpath("//a[@title='Delete']"));
		clickDeleteDD.click();
		Thread.sleep(3000);
		return this;
	}
	
	public T6_Delete clickdelete() {
		WebElement clickDelete = driver.findElement(By.xpath("//span[text()='Delete']"));
		clickDelete.click();
		System.out.println("Account Deleted");
		return this;
	}

}
