package sprint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Recherche {
	
	WebDriver driver;

	@Given("Ouvrir navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}

	@Given("chercher URL")
	public void chercher_url() {
		driver.get("https://www.google.fr/");
		WebElement btcookies;
		btcookies= driver.findElement(By.xpath("//button[contains(string(), 'Tout accepter')]"));
		btcookies.click();
	   
	}

	@When("taper le mot {string}")
	public void taper_le_mot(String string) {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(string);
	}

	@When("cliquer sur le bouton entrer")
	public void cliquer_sur_le_bouton_entrer() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(Keys.ENTER);
 
	}

	@Then("ouvrir page de recherche")
	public void ouvrir_page_de_recherche() {
		WebElement msg = driver.findElement(By.id("result-stats"));
		String text = msg.getText();
		Assert.assertTrue(text.contains("Environ"));
		System.out.println("test OK");
	    
	}


	

}
