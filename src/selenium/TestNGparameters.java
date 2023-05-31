package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.gson.stream.JsonReader;

import Factory.Login;

public class TestNGparameters
{
	static WebDriver driver;
	
	@Test
	public void TestNGparameters()
	{
		System.out.println("program starts");
		driver=new ChromeDriver();
		driver.get(JsonReader.Login_jread("url"));
		Thread.sleep(5000);
		Login lg=new Login(driver);
		lg.getun().sendKeys(JsonReader.Login_jread("username"));
		lg.getpwd().sendKeys(JsonReader.Login_jread("password"));
		lg.getlgnbtn().click();
		
	}

}
