

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver d;
	By logout=By.linkText("Log Out");
	public Logout(WebDriver d)
	{
		this.d=d;
	}

	public void clickOnLogout() {
		d.findElement(logout).click();
	}
}
