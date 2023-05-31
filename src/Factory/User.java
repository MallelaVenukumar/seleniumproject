package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User 
{
	WebDriver driver;
	public User(WebDriver driver)
	{
this.driver=driver;
PageFactory.initElements(this. driver,this);
}
	@FindBy(xpath= "//span[text()='User']")
	private WebElement creat_new_user;
	
	@FindBy(xpath= "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath= "//div[input[@type='password']]")
	private WebElement password;
	
	@FindBy(xpath="//input[@placeholder='Retype Password']")
	private WebElement retype_password;
	
	@FindBy(xpath= "//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath= "//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy (xpath= "//div[@id='userDataLightBox_commitBtn']")
	private WebElement commitbtn;
	
	public WebElement get_User()
	{
		return creat_new_user;
	}
	
	public WebElement get_username()
	{
		return username;
	}
	
	public WebElement get_password()
	{
		return password;
	}
	
	public WebElement get_retypepassword()
	{
		return retype_password;
	}
	
	public WebElement get_firstname()
	{
		return firstname;
	}
	
	public WebElement lastname()
	{
		return lastname;
	}
	
	public WebElement commitbtn()
	{
		return commitbtn;
	}
	
}
