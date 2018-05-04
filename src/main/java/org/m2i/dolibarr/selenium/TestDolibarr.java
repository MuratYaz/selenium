package org.m2i.dolibarr.selenium;

import org.junit.Assert;
import org.junit.Test;
//import static org.junit.asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestDolibarr {

	@Test
	public void testconnexion() {
	// On instancie le driver
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://demo.testlogiciel.pro/dolibarr");
	driver.findElement(By.id("username")).sendKeys("jsmith");
	driver.findElement(By.id("password")).sendKeys("hp");
//	driver.findElement(By.cssSelector("input.button")).click();
	driver.findElement(By.className("button")).click();
	
	Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
	
//	deconnexion par css
	// driver.findElement(By.cssSelector("img.login")).click();
	// deconnexion par xpath
	driver.findElement(By.xpath("//img[@alt='Déconnexion']")).click();
	
	
	}
	
	
	
	
}
