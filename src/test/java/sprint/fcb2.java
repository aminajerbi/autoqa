package sprint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class fcb2 {
	WebDriver driver;
	@Given("ouvrir URL fcb")
	
	public void ouvrir_url_fcb() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://fr-fr.facebook.com/");
		WebElement btcookies;
		btcookies = driver.findElement(By.xpath("//button[contains(string(), 'Autoriser les cookies essentiels et optionnels')]"));
		btcookies.click();
		WebElement inscrire ;
		inscrire =driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		inscrire.click();
		
	}

	@When("saisir le prénom {string}")
	public void saisir_le_prénom(String string) {
	   WebElement  prenom;
	   prenom = driver.findElement(By.xpath("//input[@name='firstname']"));
	   prenom.sendKeys(string);
	}

	@When("saisir le nom de Famille {string}")
	public void saisir_le_nom_de_famille(String string) {
	    WebElement nom;
	    nom = driver.findElement(By.xpath("//input[@name='lastname']"));
	    nom.sendKeys(string);
	}

	@When("saisir l adresse mail {string}")
	public void saisir_l_adresse_mail(String string) {
	  WebElement email;
	  email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	  email.sendKeys(string);
	}
	@When("confirmer l adresse mail {string}")
	public void confirmer_l_adresse_mail(String string) {
		WebElement cemail;
		  cemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		  cemail.sendKeys(string);
	}
	
	@When("taper le mot de passe suivant {string}")
	public void mdp(String string) {
	 WebElement mdp;
	 mdp = driver.findElement(By.id("password_step_input"));
	 mdp.sendKeys(string);
	}
	
	@When("choisir date de naissance {string}")
	public void choisir_date_de_naissance(String string) {
	   WebElement datenaissance;
	   datenaissance =  driver.findElement(By.xpath("//select[@title='Jour']"));
	   datenaissance.sendKeys(string);
	}

	@When("choisir le mois {string}")
	public void choisir_le_mois(String string) {
		WebElement mois;
		 mois = driver.findElement(By.xpath("//select[@title='Mois']"));
		 mois.sendKeys(string);
	}

	@When("choisir l annee {string}")
	public void choisir_l_annee(String string) {
		WebElement annee;
		 annee = driver.findElement(By.id("year"));
		 annee.sendKeys(string);
	}

	@When("cliquer le genre")
	public void cliquer_le_genre() {
	   WebElement genre;
	   genre = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
	   genre.click();
	}

	@When("cliquer sur le bouton inscrire")
	public void cliquer_sur_le_bouton_inscrire() {
		WebElement element = driver.findElement(By.name("websubmit"));
		element.sendKeys(Keys.ENTER);
		driver.close();
	}
	
	@Then("valider le test")
	public void valider_le_test() {
	    System.out.println("Test ok ");
	}
	
	


}
