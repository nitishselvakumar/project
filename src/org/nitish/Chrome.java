package org.nitish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NITISH\\eclipse-workspace\\nitish\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions acc=new Actions(driver);
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement mouseover = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		acc.moveToElement(mouseover).perform();
		
		WebElement mouseover1 = driver.findElement(By.xpath("//a[@alt='Home|CT4P2|Mobiles & |NA|Smart Phones|Rs.5001 - Rs.10000|NA|NA|CT@Rs.5001 - Rs.10000']"));
		
		acc.moveToElement(mouseover1).perform();
		
		
		
	}
}









