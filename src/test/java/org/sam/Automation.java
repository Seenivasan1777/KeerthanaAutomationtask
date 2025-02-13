package org.sam;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;


public class Automation {
	
public static EdgeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		


		 driver=new EdgeDriver();
	
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        
	            driver.get("https://www.douglas.de/de");
	            

	  		  driver.manage().window().maximize(); 
	  		  
	  		  
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement shadowHost = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[id^='usercentrics-root']")));

	            SearchContext shadowRoot = shadowHost.getShadowRoot();

	            WebElement acceptAllButton = shadowRoot.findElement(By.cssSelector("button[data-testid='uc-accept-all-button']"));

	            acceptAllButton.click();
	        

	            String actualUrl = driver.getCurrentUrl();
	            Assert.assertTrue("The URL does not contain 'douglas'", actualUrl.contains("douglas"));

			            
	            
	            WebElement parfum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='PARFUM']")));
	            parfum.click();
	
		          System.out.println("✅ Navigated to PARFUM");


			   WebElement marke = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Marke']")));
			   marke.click();

			   WebElement markefirstoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='-417']")));
			   markefirstoption.click();
	           System.out.println("✅ Filtered first option in Marke");
	
	 	
	          WebElement productkart= driver.findElement(By.xpath("//div[text()='Produktart']"));
		      productkart.click();
		      WebElement pkfirstoption= driver.findElement(By.xpath("//input[@class='L0cGE_g_MG_wpv4Hq1Rn']"));
	          pkfirstoption.click();
	          System.out.println("✅ Filtered first option in Productkart");

	
	         WebElement Geschenk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Geschenk für']")));
	         Geschenk.click();
			WebElement Geschenkoption= driver.findElement(By.xpath("//input[@class='L0cGE_g_MG_wpv4Hq1Rn']"));
			Geschenkoption.click();
			System.out.println("✅ Filtered first option in Geschenko");
				
			
            WebElement furwen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Für Wen']")));
            furwen.click();
			WebElement furwenoption= driver.findElement(By.xpath("//input[@class='L0cGE_g_MG_wpv4Hq1Rn']"));
			furwenoption.click();
		 
            WebElement Product= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-testid='image-link']")));
            Product.click();
            System.out.println("✅ Product selected and ready to buy now");
			
	}}