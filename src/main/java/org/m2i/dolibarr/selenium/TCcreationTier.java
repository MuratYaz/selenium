package org.m2i.dolibarr.selenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TCcreationTier {

	ChromeDriver driver;
	
	@Before
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	//	ChromeDriver  driver = new ChromeDriver(); 
		
		driver.get("http://demo.testlogiciel.pro/dolibarr/index.php");
		driver.findElement(By.id("username")).sendKeys("jsmith");
		driver.findElement(By.id("password")).sendKeys("hp");
		driver.findElement(By.cssSelector("input.button")).click();
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	
	
	
	
	
	@Test
	public void test() {
//		fail("Not yet implemented");
		

	
	//driver.findElement(By.className("mainmenua_companies")).click();
	//class="mainmenu companies"	
	driver.findElement(By.cssSelector("div.mainmenu.companies")).click();
	driver.findElement(By.linkText("Nouveau tiers")).click();
	driver.findElement(By.name("nom")).sendKeys("L EPONGE");
	driver.findElement(By.name("firstname")).sendKeys("BOB");
	new Select (driver.findElement(By.name("civilite_id"))).selectByVisibleText("Docteur");
	//driver.findElement(By.name("civilite_id")).click();
	
	driver.findElement(By.name("address")).sendKeys("55 av grande arche");
	driver.findElement(By.id("zipcode")).sendKeys("15978");
	driver.findElement(By.id("town")).sendKeys("voltran");
	
	}	
		
	 @After
	  public void tearDown() throws Exception {
		 driver.findElement(By.xpath("//img[@alt='Déconnexion']")).click();
		 
	  // driver.quit();
	  driver.close();
	  }	
		
		
		/*
		 * package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TCCreerUnTier {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTCCreerUnTier() throws Exception {
    driver.get("http://demo.testlogiciel.pro/dolibarr/index.php");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("jsmith");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("hp");
    driver.findElement(By.cssSelector("input.button")).click();
    driver.findElement(By.xpath("//li[@id='mainmenutd_companies']/div[2]/a/div")).click();
    driver.findElement(By.linkText("Nouveau tiers")).click();
    driver.findElement(By.name("nom")).click();
    driver.findElement(By.name("nom")).clear();
    driver.findElement(By.name("nom")).sendKeys("NouveauNomTier");
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("NouveauPrenomTier");
    driver.findElement(By.name("civilite_id")).click();
    new Select(driver.findElement(By.name("civilite_id"))).selectByVisibleText("Monsieur");
    driver.findElement(By.name("civilite_id")).click();
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("21 rue d'Altran");
    driver.findElement(By.id("zipcode")).click();
    driver.findElement(By.id("zipcode")).clear();
    driver.findElement(By.id("zipcode")).sendKeys("19191");
    driver.findElement(By.id("town")).click();
    driver.findElement(By.id("town")).clear();
    driver.findElement(By.id("town")).sendKeys("BeauCoin");
    driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
    driver.findElement(By.id("card")).click();
    driver.findElement(By.id("customer")).click();
    driver.findElement(By.id("supplier")).click();
    driver.findElement(By.id("agenda")).click();
    driver.findElement(By.id("consumption")).click();
    driver.findElement(By.xpath("//img[@alt='Déconnexion']")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

		 * 
		 * 
		 */
		
		
	}


