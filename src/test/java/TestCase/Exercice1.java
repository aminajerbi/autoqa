package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice1 {

	private static final String WebDriverManager = null;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver" , "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/fr/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com");

	}

}
