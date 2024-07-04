package org.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	public static void launchURL() {
		driver = new ChromeDriver();
		driver.get("https://norsup.nuventuretech.com/login/?next=/");
		driver.manage().window().maximize();
		

	}
}
