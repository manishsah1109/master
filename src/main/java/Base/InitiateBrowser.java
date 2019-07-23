package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.HomePage;
import TestCases.LogintoPaytm;

public class InitiateBrowser {
public WebDriver driver;

@BeforeTest
public void  browser() throws IOException, InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Adecco\\Eclipse\\PaytmEtoEFrameWork\\BrowserEXE\\chromedriver.exe");
	
driver=new ChromeDriver();
Properties prop=new Properties();
FileInputStream fis=new FileInputStream("C:\\Adecco\\Eclipse\\PaytmEtoEFrameWork\\Resources\\data.properties");
prop.load(fis);
System.out.println("url is="+prop.getProperty("url"));
driver.get(prop.getProperty("url"));
driver.manage().window().maximize();


}

public void windowhandle()
{
	
 String  handle= driver.getWindowHandle();
 Set<String> handle1= driver.getWindowHandles();//Return a set of window handle
 driver.switchTo().window("handle");

}

public void iframe()
{
	int elements = driver.findElements(By.tagName("iframe")).size();

	System.out.println("number og i frame present in the page=="+ elements);

	
	for(int i=0; i<=elements; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/h1/span")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	}	
}


}
