

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class MagentoTest {
	@Test
	public void posCredentials() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.magento.com");
		Main m=new Main(d);
		m.clickOnMyacc();
		Login l=new Login(d);
		l.typeEmail("subramanyaraj87@gmail.com");
		l.typePass("Welcome123");
		l.clickOnLogin();
		Logout lo=new Logout(d);
		lo.clickOnLogout();
		d.quit();
		

	}

}
