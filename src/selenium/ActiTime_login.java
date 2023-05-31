package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://online.actitime.com/microsoft1/login.do");
driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("venu.kumarmallela7337@gmail.com");
driver.findElement(By.name("pwd")).sendKeys("Venu@2002");
driver.findElement(By.id("loginButton")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//div[@id='container_reports']")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//div[@class='components-Buttons-text--1m8z0MdM']")).click();
Thread.sleep(500);
driver.findElement(By.xpath("//div[normalize-space()='Create Chart']")).click();
Thread.sleep(1000);

	}

}
