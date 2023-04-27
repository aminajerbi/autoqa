package TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chemin chrome 
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//implicity waite 
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://demoqa.com/droppable");
				//identification des element
				WebElement from;
				WebElement to;
				from= driver.findElement(By.id("draggable"));
				to= driver.findElement(By.id("droppable"));
				Actions action = new Actions (driver);
				action.dragAndDrop(from, to).perform();
				
				//Verification 
				String texte; 
				texte = to.getText();
				Assert.assertEquals(texte, "Dropped!");
				System.out.println("test Ok");
				
	}

}
