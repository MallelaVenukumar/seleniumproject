package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asserts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("HYR tutorial",Keys.ENTER);
		String exceptedTitel="HYR tutorial- google search";		
		String actualTitel= driver.getTitle();
		Asserts.assertsEquals(actualTitel , exceptedTitel);
		driver.quit();
	}

	private static void assertsEquals(String actualTitel, String exceptedTitel) {
		// TODO Auto-generated method stub
		
	}

		
	}


