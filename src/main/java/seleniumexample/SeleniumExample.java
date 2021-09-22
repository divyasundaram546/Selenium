package seleniumexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumExample {

	
	@Test
	public void testhelloworld2()
	{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	 // Instantiate a ChromeDriver class.
	 WebDriver driver=new ChromeDriver();

	 // Launch Website
	 driver.navigate().to("http://www.javatpoint.com/");

	 //Maximize the browser
	 driver.manage().window().maximize();

	 //Scroll down the webpage by 5000 pixels
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("scrollBy(0, 5000)");

	 // Click on the search text box and send value
	 driver.findElement(By.id("gsc-i-id1")).sendKeys("core Java");

	 // Click on the search button
	 driver.findElement(By.className("gsc-search-button")).click();
	 }}

