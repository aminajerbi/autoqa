package TestCase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chemin chrome 
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//implicity waite 
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/select-menu");
				WebElement liste_couleur;
				liste_couleur = driver.findElement(By.id("oldSelectMenu"));
				 //selection d'1 element ds la liste deroulante
				Select select = new Select (liste_couleur);
				select.selectByValue("4");
				driver.close();
				
	}

}
