package ExerciceFCB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Fcb {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicity waite 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://fr-fr.facebook.com/");
		
		
		WebElement btcookies;
		btcookies= driver.findElement(By.xpath("//button[contains(string(), 'Autoriser les cookies essentiels et optionnels')]"));
		btcookies.click();
		WebElement btinscription;
		btinscription = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		btinscription.click();
		Actions action= new Actions(driver);
		//action.doubleClick(btDouble).perform();
		action.click(btinscription).perform();
		driver.findElement(By.xpath("//input[@placeholder='Prénom']")).sendKeys("Amina");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jerbi");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("0766445598");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456789");
		
	//WebElement liste_couleur;
	//	liste_couleur = driver.findElement(By.id("oldSelectMenu"));
		 //selection d'1 element ds la liste deroulante
		//Select select = new Select (liste_couleur);
	//	select.selectByValue("4");
		
		WebElement jour;
		jour = driver.findElement(By.id("day"));
		Select select = new Select (jour);
		select.selectByValue("18");
		
		WebElement mois;
		mois = driver.findElement(By.id("month"));
		select.selectByValue("7");
		
		WebElement annee;
		annee = driver.findElement(By.id("year"));
		Select selec = new Select (annee);
		selec.selectByValue("2019");
		
		WebElement genre;
		genre = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		genre.click();
		
		//s inscrire
		WebElement inscrire;
		inscrire = driver.findElement(By.xpath("//button[@name='websubmit']"));
		inscrire.submit();
		
		driver.close();
		
	}

}
