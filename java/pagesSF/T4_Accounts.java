package pagesSF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseSF.BaseClassSF;

public class T4_Accounts extends BaseClassSF {
	
	public T4_Accounts clicknewbutton() {
		WebElement clickNew = driver.findElement(By.xpath("//div[@title='New']"));
		clickNew.click();
		return this;
	}
	
	public T4_Accounts AccName() {
		WebElement AccountName = driver.findElement(By.xpath("(//input[@class='slds-input'])[5]"));
		AccountName.sendKeys("Joy");
		return this;
	}
	
	public T4_Accounts clicksave() {
		WebElement clickSave = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
		clickSave.click();
		return this;
	}
	
	public T5_Edit clickAccount() {
		WebElement clickAccounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click()", clickAccounts);
		return new T5_Edit();
	}
	

}
