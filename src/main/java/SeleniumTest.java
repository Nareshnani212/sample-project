import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        // Create Chrome and Firefox drivers
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();

        // Navigate to Google and print title
        chromeDriver.get("https://www.google.com/");
        System.out.println(chromeDriver.getTitle());

        // Navigate to Firefox and print title
        firefoxDriver.get("https://www.google.com/");
        System.out.println(firefoxDriver.getTitle());

        // Quit drivers
        chromeDriver.quit();
        firefoxDriver.quit();
	}

}
