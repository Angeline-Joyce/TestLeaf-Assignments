package pagesSF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import baseSF.BaseClassSF;

public class T5_Edit extends BaseClassSF {
	public T5_Edit searchbox() throws InterruptedException {
		WebElement editsearchBox = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
		editsearchBox.sendKeys("Joy",Keys.ENTER);
		Thread.sleep(3000);
		return this;
	}
	
	public T5_Edit showActions() throws InterruptedException {
		WebElement editshowOptions = driver.findElement(By.xpath("//span[text()='Show Actions']"));
		driver.executeScript("arguments[0].click()", editshowOptions);
		Thread.sleep(3000);
		return this;
	}
	
	public T5_Edit edit() {
		WebElement clickEdit = driver.findElement(By.xpath("//a[@title='Edit']"));
		clickEdit.click();
		return this;
	}
	
	public T5_Edit rating() throws InterruptedException {
		WebElement ratingDD = driver.findElement(By.xpath("(//button[@data-value='--None--'])[1]"));
		driver.executeScript("arguments[0].click()", ratingDD);
		Thread.sleep(3000);
		WebElement clickWarm = driver.findElement(By.xpath("//span[@title='Warm']"));
		driver.executeScript("arguments[0].click()", clickWarm);
		return this;
	}
	
	public T5_Edit type() throws InterruptedException {
		WebElement typeDD = driver.findElement(By.xpath("(//button[@role='combobox'])[3]"));
		driver.executeScript("arguments[0].click()", typeDD);
		Thread.sleep(3000);
		
		WebElement typeDDoption = driver.findElement(By.xpath("//span[text()='Installation Partner']"));
		typeDDoption.click();
		return this;
	}
	
	public T5_Edit ownership() throws InterruptedException {
		WebElement ownershipDD = driver.findElement(By.xpath("(//button[@role='combobox'])[4]"));
		driver.executeScript("arguments[0].click()", ownershipDD);
		Thread.sleep(3000);
		WebElement ownershipDDoption = driver.findElement(By.xpath("//span[text()='Public']"));
		ownershipDDoption.click();
		return this;
	}
	
	public T5_Edit industry() throws InterruptedException {
		WebElement industryDD = driver.findElement(By.xpath("(//button[@role='combobox'])[5]"));
		industryDD.click();
		Thread.sleep(3000);
		WebElement industryDDoption = driver.findElement(By.xpath("//span[text()='Apparel']"));
		industryDDoption.click();
		return this;
	}
	
	public T5_Edit Billingst() {
		WebElement billingStreet = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
		billingStreet.sendKeys("TestLeaf Chennai");
		return this;
	}
	
	public T5_Edit Shippingst() {
		WebElement shippingStreet = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
		shippingStreet.sendKeys("TestLeaf Chennai");
		return this;
	}
	
	public T5_Edit customerPriority() throws InterruptedException {
		WebElement customerPriorityDD = driver.findElement(By.xpath("(//button[@role='combobox'])[6]"));
		driver.executeScript("arguments[0].click()", customerPriorityDD);
		Thread.sleep(3000);
		WebElement customerPriorityOption = driver.findElement(By.xpath("//span[text()='High']"));
		customerPriorityOption.click();
		return this;
	}
	
	public T5_Edit SLA() throws InterruptedException {
		WebElement SLA_DD = driver.findElement(By.xpath("(//button[@role='combobox'])[7]"));
		SLA_DD.click();
		Thread.sleep(3000);
		WebElement SLA_DDoption = driver.findElement(By.xpath("//span[text()='Gold']"));
		SLA_DDoption.click();
		return this;
	}
	
	public T5_Edit upsellOpportunity() throws InterruptedException {
		WebElement upsellOpportunityDD = driver.findElement(By.xpath("(//button[@role='combobox'])[8]"));
		upsellOpportunityDD.click();
		Thread.sleep(3000);
		WebElement upsellOpportunityDDOption = driver.findElement(By.xpath("//span[text()='No']"));
		upsellOpportunityDDOption.click();
		return this;
	}
	
	public T5_Edit active() throws InterruptedException {
		WebElement activeDD = driver.findElement(By.xpath("(//button[@role='combobox'])[9]"));
		driver.executeScript("arguments[0].click()", activeDD);
		Thread.sleep(3000);
		WebElement activeDDoption = driver.findElement(By.xpath("(//span[text()='No'])[3]"));
		activeDDoption.click();
		return this;
	}
	
	public T6_Delete editSave() throws InterruptedException {
		WebElement editSaveButton = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
		editSaveButton.click();
		Thread.sleep(5000);
		return new T6_Delete();
	}

}
