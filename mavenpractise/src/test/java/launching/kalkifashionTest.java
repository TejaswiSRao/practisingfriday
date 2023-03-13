package launching;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kalkifashionTest {
	@Test
	public void browser() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.kalkifashion.com/");
	}

}
