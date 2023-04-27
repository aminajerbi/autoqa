package sprint3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Fcb3 {

	WebDriver driver;
	
	@Given("ouvrir URLs fcb")
	public void ouvrir_ur_ls_fcb() {
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

	@When("saisir le prénoms {string}")
	public void saisir_le_prénoms(String string) {
		 WebElement  prenom;
		   prenom = driver.findElement(By.xpath("//input[@name='firstname']"));
		   prenom.sendKeys(string);
	}

	@When("saisir le nom de Familles {string}")
	public void saisir_le_nom_de_familles(String string) {
		 WebElement nom;
		    nom = driver.findElement(By.xpath("//input[@name='lastname']"));
		    nom.sendKeys(string);
	}

	@When("saisir l adresse mails {string}")
	public void saisir_l_adresse_mails(String string) {
		 WebElement email;
		  email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		  email.sendKeys(string);
	}

	@When("confirmer l adresse mails {string}")
	public void confirmer_l_adresse_mails(String string) {
		WebElement cemail;
		  cemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		  cemail.sendKeys(string);
	}

	@When("taper le mot de passe suivants {string}")
	public void taper_le_mot_de_passe_suivants(String string) {
		WebElement mdp;
		 mdp = driver.findElement(By.id("password_step_input"));
		 mdp.sendKeys(string);
	}

	@When("choisir date de naissances {string}")
	public void choisir_date_de_naissances(String string) {
		WebElement datenaissance;
		   datenaissance =  driver.findElement(By.xpath("//select[@title='Jour']"));
		   datenaissance.sendKeys(string);
	}

	@When("choisi le mois {string}")
	public void choisi_le_mois(String string) {
		WebElement mois;
		 mois = driver.findElement(By.xpath("//select[@title='Mois']"));
		 mois.sendKeys(string);
	}

	@When("choisi l annee {string}")
	public void choisi_l_annee(String string) {
		WebElement annee;
		 annee = driver.findElement(By.id("year"));
		 annee.sendKeys(string);
	}
	
	

	@When("cliquer le genres {string}")
	public void cliquer_le_genres(String string) {
		if (string.equals("homme")) {
		 WebElement genre;
		   genre = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		   genre.click();
		}
		else if (string.equals("femme")) {
			WebElement genre;
			   genre = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
			   genre.click();
		}
		else {
			WebElement genre;
			   genre = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
			   genre.click();
		}
	}

	@When("cliquer sur les boutons inscriress")
	public void cliquer_sur_les_boutons_inscriress() {
		WebElement element = driver.findElement(By.name("websubmit"));
		element.sendKeys(Keys.ENTER);
		
	}

	@Then("valider les tests")
	public void valider_les_tests() {
		System.out.println("Test ok ");
	}

}
