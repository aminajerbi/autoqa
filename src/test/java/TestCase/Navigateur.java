package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class Navigateur {
	
	private WebDriver driver = null;
	
	@Given ("acceder a la URL")
	public void acceder_url() throws InterruptedException {
		//acceder au URL
		driver.get("https://www.google.fr/");
		//theard (temps )
		Thread.sleep(5000);
	}
	
	@Given("ouvrir navigateur")
	public void ouvrir_navigateur() {
		//chemin chromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir de chrome 
		driver = new ChromeDriver();
		//grandir le fenetre du chrome 

		driver.manage().window().maximize();
		// sup les cookies 
		driver.manage().deleteAllCookies();
	}

	public static void main(String[] args) throws InterruptedException {
		
		//chemin chromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir de chrome 
		WebDriver driver = new ChromeDriver();
		//grandir le fenetre du chrome 
		
		driver.manage().window().maximize();
		// sup les cookies 
		driver.manage().deleteAllCookies();
		
		//acceder au URL
		driver.get("https://www.google.fr/");
		//theard (temps )
		Thread.sleep(5000);
		//declerer web elmt
		WebElement barre;
		
	
		//identifier l'elmt 
		
		barre= driver.findElement(By.id("APjFqb"));
		// action sur les elements 
		barre.sendKeys("tunisie");
		
		//close chrome 
		//driver.close();
		
		

	}

}
