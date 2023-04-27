package ExerciceFCB;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Exercicefcb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicity waite 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://fr-fr.facebook.com/");
		//WebElement btcookies;
		//btcookies= driver.findElement(By.id("u_0_e_XD"));
		//driver.manage().deleteAllCookies();
		Set<Cookie> cookiesList = driver.manage().getCookies();
		System.out.println("Count of cookies = " + cookiesList.size());
		
		
		
		

	}

}
