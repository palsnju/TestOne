

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver d;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	public Login(WebDriver d) {
		this.d=d;
		
	}
	public void typeEmail(String data)
	{
		d.findElement(email).sendKeys(data);
	}
	public void typePass(String data)
	{
		d.findElement(pwd).sendKeys(data);
	}
	public void clickOnLogin()
	{
		d.findElement(login).click();
	}
	

}
