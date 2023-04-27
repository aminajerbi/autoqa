package sprint;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificationjava {
	WebDriver driver;
	
		@Given("ouvrir le navigateur")
		public void ouvrir_le_navigateur() {
			System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		@Given("acceder a l URL")
		public void acceder_a_l_url() {
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}

		@When("saisir le login")
		public void saisir_le_login() {
			WebElement login = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			login.sendKeys("Admin");
		   
		}

		@When("saisir le mot de passe")
		public void saisir_le_mot_de_passe() {
			WebElement mdp = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			mdp.sendKeys("admin123");
		  
		}

		@When("cliquer sur le bouton")
		public void cliquer_sur_le_bouton() {
			WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
			btn.click();
		}

		@Then("ouvrir page home")
		public void ouvrir_page_home() {
			WebElement profil;
			profil = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
			 String texte;
			 texte = profil.getText();
			Assert.assertEquals("PaulPavan Collings", texte);
			 System.out.println("test ok");
			 
		}


	}


