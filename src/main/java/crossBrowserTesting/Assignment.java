package crossBrowserTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment extends CrossBrowserTesting {

	String expected = "";

	@Test
	public void testSearchItem() {

		// xpath for search term
		driver.findElement(By.xpath("")).sendKeys("Search Hello");

		// xpath for search content
		driver.findElement(By.xpath("")).sendKeys("Search Hello Hello");

		// click on find button
		driver.findElement(By.xpath("")).click();

	}

	@Test
	public void testWebAlert() {

		Alert alert = driver.switchTo().alert();

		String actual = alert.getText();
		Assert.assertEquals(actual, expected);
	}

}
