package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement lgnbtn;
	
	public WebElement getun() 
	{
		return un;
	}

	public WebElement getpwd()
	{
		return password;
	}

	public WebElement getlgnbtn()
	{
		return lgnbtn;
	}
		
	}


