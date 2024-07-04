package org.page;
import java.time.Duration;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BaseClass{

	public LoginPage() {
		PageFactory.initElements(driver, this);
		
		
	}
	public void checkEmptyDetails(String user, String pass) throws Exception {
		launchURL();
		WebElement username = driver.findElement(By.name("auth-username"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.name("auth-password"));
		password.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.id("login_btn"));
		btnLogin.click();
		Thread.sleep(2000);
		WebElement  errormsg = driver.findElement(By.xpath("//div[@role='alert']"));
		String text = errormsg.getText();
		if(text.contains("Please enter a correct email address and password")) {
				System.out.println("Home Page not displayed");
			}
		else {			
			System.out.println("Home Page displayed");
		}
		driver.close();
	}
	public void enterCorrectPasswordEmptyUsername(String user, String pass) throws Exception {
		launchURL();
		WebElement username = driver.findElement(By.name("auth-username"));
		username.sendKeys(user);	
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("auth-password"));
		password.sendKeys(pass);
		Thread.sleep(2000);
		WebElement btnLogin = driver.findElement(By.id("login_btn"));
		btnLogin.click();
		Thread.sleep(2000);
		WebElement  errormsg = driver.findElement(By.xpath("//div[@role='alert']"));
		String text = errormsg.getText();
		if(text.contains("Please enter a correct email address and password")) {
			System.out.println("Home Page not displayed");
		}
		else {			
			System.out.println("Home Page displayed");
		}
		
		driver.close();
	}
	public void checkValidUserInHomePage(String user, String pass) {
		launchURL();
		WebElement username = driver.findElement(By.name("auth-username"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.name("auth-password"));
		password.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.id("login_btn"));
		btnLogin.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[text()='Dashboard']")));
		if(element.isDisplayed()) {
			System.out.println("Home Page displayed successfully");
		}else {			
				System.out.println("Home Page not displayed");	
					}
		driver.close();
	}
		
	public void enterWrongPasswordWrongUsername(String user, String pass) throws Exception {
		launchURL();
		WebElement username = driver.findElement(By.name("auth-username"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.name("auth-password"));
		password.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.id("login_btn"));
		btnLogin.click();
		Thread.sleep(2000);
			WebElement  errormsg = driver.findElement(By.xpath("//div[@role='alert']"));
			String text = errormsg.getText();
			if(text.contains("Please enter a correct email address and password")) {
				System.out.println("Home Page not displayed");
			}
			else {			
				System.out.println("Home Page displayed");
			}
				
		driver.close();
	}
	

}
