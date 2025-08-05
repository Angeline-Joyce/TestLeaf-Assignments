package Marathon4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditAccount extends baseClass {

	@Test(dependsOnMethods={"runCreateAccount"},dataProvider="dp")
    public void runEditAccount(String accountName, String billingstr, String shippingstr) throws InterruptedException {
        
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accountName+ Keys.ENTER);
        Thread.sleep(3000);
        WebElement DDicon = driver.findElement(By.xpath("//span[text()='Show Actions']"));
        driver.executeScript("arguments[0].click()", DDicon);
        
        driver.findElement(By.xpath("//a[@title='Edit']")).click();
        Thread.sleep(3000);
        WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
        driver.executeScript("arguments[0].click()",typeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
        Thread.sleep(3000);
        WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
        driver.executeScript("arguments[0].click()",industryDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
        Thread.sleep(3000);
        WebElement billingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
        billingStreet.clear();
        billingStreet.sendKeys(billingstr);
        Thread.sleep(3000);
        WebElement shippingStreet = driver.findElement(By.xpath("//label[text()='Shipping Street']/following::textarea"));
        shippingStreet.clear();
        shippingStreet.sendKeys(shippingstr);
        Thread.sleep(3000);
        WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
        driver.executeScript("arguments[0].click()",priorityDD);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
        driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
        WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
        Thread.sleep(3000);
        driver.executeScript("arguments[0].click()",activeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        int randomNum1 = (int)(Math.random()*999999);
        int randomNum2 = (int)(Math.random()*999999);
        String phno = ""+randomNum1+randomNum2;
        phno = phno.substring(0,10);
        System.out.println(phno);
        WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(phno);
        Thread.sleep(3000);
        //selecing UpsellOpportunity and click Save button
        WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(3000);
        //Retrieving the phone number and printing it
        String phnoStr = driver.findElement(By.xpath("//table/tbody/tr[1]/td[4]")).getText();
        System.out.println(phnoStr);
        //Using assertion to verify the phone number 
        Assert.assertTrue(phnoStr.contains(phno),"verify the mobileNumber");

    }

}




   

