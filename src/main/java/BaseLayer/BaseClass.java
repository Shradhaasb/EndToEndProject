package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("--incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (browserName.equalsIgnoreCase("--headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver(opt);
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();	

	}

}
