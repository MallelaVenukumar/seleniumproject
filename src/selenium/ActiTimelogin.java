package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimelogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Users']")).click();
		driver.findElement(By.xpath("//span[@unselectable='on']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("RouteoneIndia");
		driver.findElement(By.name("passwordText")).sendKeys("123123");
		driver.findElement(By.name("firstname")).sendKeys("Route");
		driver.findElement(By.name("lastname")).sendKeys("India");
		driver.findElement(By.name("overtimeTracking")).click();
		driver.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
		
		
	}

}
