package org.sam;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Automation {
	
public static FirefoxDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		


		 driver=new FirefoxDriver();
	driver.get("https://www.douglas.de/de");

	driver.manage().window().maximize();
	
	  driver.navigate().refresh();

	  
	  Thread.sleep(2000);


//	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		  JavascriptExecutor js = (JavascriptExecutor) driver;
//		  
//		  WebElement cookieButton = (WebElement) js.executeScript(
//		      "return document.querySelector('#usercentrics-root').shadowRoot.querySelector('button[data-testid=\"uc-privacy-button\"]');"
//		  );
//		  cookieButton.click();
	
		WebElement parfum = driver.findElement(By.xpath("(//a[@href='/de/c/parfum/01'])[1]"));
		parfum.click();
		
		Thread.sleep(10000);
		
		WebElement marke= driver.findElement(By.xpath("//div[text()='Marke']"));
		marke.click();
		WebElement markefirstoption= driver.findElement(By.xpath("(//input[@class='L0cGE_g_MG_wpv4Hq1Rn'])[1]"));
		markefirstoption.click();
		 
		 Thread.sleep(3000);
	
	

		WebElement productkart= driver.findElement(By.xpath("//div[text()='Produktart']"));
		productkart.click();
		WebElement pkfirstoption= driver.findElement(By.xpath("//input[@class='L0cGE_g_MG_wpv4Hq1Rn']"));
		pkfirstoption.click();
		
		 Thread.sleep(3000);
			
			
           WebElement Geschenk= driver.findElement(By.xpath("//div[text()='Geschenk für']"));
			Geschenk.click();
			WebElement Geschenkoption= driver.findElement(By.xpath("//input[@class='L0cGE_g_MG_wpv4Hq1Rn']"));
			Geschenkoption.click();
			
			 Thread.sleep(3000);
				
				
	          WebElement furwen= driver.findElement(By.xpath("//div[text()='Für Wen']"));
			furwen.click();
			WebElement furwenoption= driver.findElement(By.xpath("//input[@class='L0cGE_g_MG_wpv4Hq1Rn']"));
			furwenoption.click();
		 
	}
    }

