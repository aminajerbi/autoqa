package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Right_click {

	public static void main(String[] args) {
		//chemin chrome 
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//implicity waite 
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/buttons");
				//identification des element 
				WebElement Rclick;
				Rclick = driver.findElement(By.id("rightClickBtn"));
				Actions action= new Actions(driver);
				action.contextClick(Rclick).perform();
				// verification 
				WebElement MessageRight;
				MessageRight = driver.findElement(By.id("rightClickMessage"));

				String text; 
				text = MessageRight.getText();
				Assert.assertEquals(text, "You have done a right click");
				System.out.println("test OK");
				
	}

}
