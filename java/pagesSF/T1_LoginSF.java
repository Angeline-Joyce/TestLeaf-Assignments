package pagesSF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseSF.BaseClassSF;

public class T1_LoginSF extends BaseClassSF {
	public T1_LoginSF username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		return this;
	}
	
	public T1_LoginSF pswrd() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@2025");
		return this;
	}
	
	public T2_HomeSF login() {
		WebElement loginButton = driver.findElement(By.xpath("(//input[@id='Login'])[1]"));
		loginButton.click();
		return new T2_HomeSF();
	}
}
