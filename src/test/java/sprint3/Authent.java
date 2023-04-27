package sprint3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Authent {
	
	WebDriver driver;

	@Given("ouvrir le navigateurs")
	public void ouvrir_le_navigateurs() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	}

	@Given("acceder a l URLs")
	public void acceder_a_l_ur_ls() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("saisir le logins {string}")
	public void saisir_le_logins(String string) {
		WebElement login = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		login.sendKeys(string);
	 
	}

	@When("saisir le mot de passes {string}")
	public void saisir_le_mot_de_passes(String string) {
		WebElement mdp = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		mdp.sendKeys(string);
	}

	@When("cliquer sur le boutons")
	public void cliquer_sur_le_boutons() {
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		btn.click();
	}

	@Then("ouvrir page homes")
	public void ouvrir_page_homes() {
		WebElement profil;
		profil = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		 String texte;
		 texte = profil.getText();
		Assert.assertEquals("PaulPavan Collings", texte);
		 System.out.println("test ok");
	  	}



}
