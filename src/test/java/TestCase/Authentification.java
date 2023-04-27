package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin du driver 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture du driver
		WebDriver driver = new ChromeDriver(); 
		//Maximiser la fenetre 
		driver.manage().window().maximize();
		// acceder a l'URL 
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//temps thread
		Thread.sleep(5000);
		//Identification des elemts 
		WebElement identifiant; 
		WebElement mdp;
		WebElement bouton;
		
		identifiant = driver.findElement(By.name("username"));
		mdp = driver.findElement(By.name("password"));
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		//action sur les elmts
		identifiant.sendKeys("Admin");
		mdp.sendKeys("admin123");
		bouton.click();
		Thread.sleep(5000);
		
		//Verification de la connexion 
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String texte; 
		texte = profil.getText();
		Assert.assertEquals("AnyName Sohel", texte);
		System.out.println("test ok");
	

	}

}
