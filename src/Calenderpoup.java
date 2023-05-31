import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calenderpoup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver() ;
		driver.get("https://www.makemytrip.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Actions act= new Actions(driver);
WebElement departure=driver.findElement(By.xpath("//label[@for='departure']"));
act.click(departure).perform();

int i=1;
while(i<=12)
{
	try
	{
	driver.findElement(By.xpath("//div[contains(@aria-label,'Dec 11 2023')]")).click();

	}
catch (Throwable e) 
	{
driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
Thread.sleep(1000);
}
i++;	
	}

	}
}
