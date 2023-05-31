package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.EnterTimetrack;
import Factory.Login;
import Factory.User;

public class Test
{
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
	driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	Login lg=new Login(driver);
	lg.getun().sendKeys("admin");
	lg.getpwd().sendKeys("manager");
	lg.getlgnbtn().click();
	
	EnterTimetrack ett = new EnterTimetrack(driver);
	ett.get_users().click();
    Thread.sleep(1000);
    
    User ur=new User (driver);
    ur.get_firstname().sendKeys("Arif");
    ur.lastname().sendKeys("naikodi");
    ur.get_User().sendKeys("Arif");
    ur.get_password().sendKeys("123123");
    ur.get_retypepassword().sendKeys("123123");
    ur.commitbtn().click();
    
	}

}
