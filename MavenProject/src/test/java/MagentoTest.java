import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MagentoTest {
	@Test
	public void openBrowser()

	{
		String url="http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Home h = new Home(driver);
		h.clickOnMyAcc();
		Login l1 = new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typepassword("Welcome123");
		l1.clickOnLogin();
		LogOut l2 = new LogOut(driver);
		l2.clickOnLogout();
		driver.quit();
		
		

	}

}
