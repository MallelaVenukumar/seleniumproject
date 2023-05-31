package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\pic\\ADMIN\\Desktop\\java\\homepage.png");
		FileUtils.copyFile(src, destFile);

	}

}
