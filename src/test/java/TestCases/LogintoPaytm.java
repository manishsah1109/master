package TestCases;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.InitiateBrowser;
import POM.HomePage;

public class LogintoPaytm extends InitiateBrowser{
	
	
@Test(priority=1)	
public void login() throws InterruptedException
{
	
System.out.println("test1");

System.out.println("test2");
WebDriverWait wait = new WebDriverWait(driver, 40);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Accept Payments']")));
HomePage home=new HomePage(driver);
home.loginclick().click();
System.out.println("test3");
Thread.sleep(2000);
int elements = driver.findElements(By.tagName("iframe")).size();
System.out.println("iframe size is=="+ elements);
driver.switchTo().frame(0);
home.loginclick1().click();
}

@Test(priority=2)
public void entercreds()
{
	HomePage home=new HomePage(driver);
	home.username().sendKeys("8828033030");
	home.password().sendKeys("abc");
	home.submit().click();
}


}
