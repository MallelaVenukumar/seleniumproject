package Page;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Test {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Object>chromeprofile=new HashMap<String,Object>();
		chromeprofile.put("profile.defult_content_settings,popups", 0);
		chromeprofile.put("download.default_directory","D:\\New folder");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized","disable-popup-blocking");
		options.setExperimentalOption("prefs", "chromeprofile");
		driver=new ChromeDriver(options);
		
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='4.8.1']")).click();

	

	}

}
