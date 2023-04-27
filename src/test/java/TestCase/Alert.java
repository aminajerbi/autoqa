package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chemin chrome 
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//implicity waite 
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/alerts");
				//identification des elements
				WebElement Alert;
				Alert = driver.findElement(By.id("alertButton"));
				Alert.click();
				//Alert 
				driver.switchTo().alert().accept();

	}

}
