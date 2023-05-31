package Page;

import javax.sql.CommonDataSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Factory.EnterTimetrack;
import Factory.Login;

public class Test_2 {
	 static WebDriver driver;
	 

	public static void main(String[] args) throws InterruptedException {
driver=new ChromeDriver();
driver.get("http://localhost/login.do");
Thread.sleep(1000);
Login lg=new Login(driver);
lg.getun().sendKeys("admin");
lg.getpwd().sendKeys("manager");
lg.getlgnbtn().click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[text()='Work Schedule']")).click();

driver.findElement(By.xpath("//div[text()='Reports']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Current month')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//tr[@id='ext-gen120']//img[@class='date-button-image']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@id='ext-gen140']")).click();


	}

}
