package Factory;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimetrack 
{
	WebDriver driver;
	public EnterTimetrack(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	@FindBy(xpath ="//a[div[text()='Tasks']]")
	private WebElement tasks;
	
	@FindBy(xpath = "//a[div[text()='Reports']]")
	private WebElement reports;
	
	@FindBy (xpath ="//a[div[text()='Users']]")
	private WebElement users;
	
	@FindBy (xpath="//a[div[text()='Work Schedule']]")
	private WebElement work_schedule;
	
	@FindBy (xpath="//a[@class='logout']")
	private WebElement logout;
	
	public WebElement get_tasks()
	{
		return tasks;
	}
	
	public WebElement get_reports()
	{
		return reports;
	}
	public WebElement get_users()
	{
		return users;
	}
	
	public WebElement get_workschedule()
	{
		return work_schedule;
	}
	public WebElement get_logout()
	{
		return logout;
	}	
	}
	


