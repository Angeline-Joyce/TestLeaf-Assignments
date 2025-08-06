package pagesSF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseSF.BaseClassSF;

public class T3_Sales extends BaseClassSF {
	public T4_Accounts Accounts() {
		WebElement clickAccounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click()", clickAccounts);
		return new T4_Accounts();
	}
	
}
