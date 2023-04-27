package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicity waite 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/menu");
		WebElement menu; 
		menu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		Actions action = new Actions (driver);
		action.moveToElement(menu).perform();
		
		WebElement sousmenu;
		sousmenu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		Actions select = new Actions (driver);
		select.moveToElement(sousmenu).perform();
		
	}

}
