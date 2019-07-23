package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.InitiateBrowser;

public class HomePage{
	
	WebDriver driver;
	
	public By login=By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[4]/div");
	public By login1=By.xpath("//span[text()='Login/Signup with mobile number and password']");
	public By username1=By.xpath("//input[@name='username']");
	public By pwd=By.xpath("//input[@name='password']");
	public By submit=By.xpath("//img[@class='lock ng-scope']");
	
	
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement loginclick()
	{
		
return driver.findElement(login);
		
		}
	
	public WebElement loginclick1()
	{
		
return driver.findElement(login1);
		
		}
	public WebElement username()
	{
		
return driver.findElement(username1);
		
		}
	public WebElement password()
	{
		
return driver.findElement(pwd);
		
		}
	
	public WebElement submit()
	{
		
return driver.findElement(submit);
		
		}

}
