package firstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
//		 WebElement dropDown=driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		 
//		 Select sc=new Select(dropDown);
//		 sc.selectByIndex(3);
//		 sc.selectByValue("Apple");
//		 sc.selectByVisibleText("Bing");
		 
		 Actions action=new Actions(driver);
//		 action.contextClick().build().perform();
		 WebElement sel=driver.findElement(By.xpath("//b[text()='Selenium']"));
//		 action.contextClick(sel).build().perform();
		 action.moveToElement(sel).build().perform();
//		 action.contextClick(sel).keyDown(Keys.CONTROL).click(sel).keyUp(Keys.CONTROL).build().perform();
		 action.contextClick(sel).keyDown(Keys.CONTROL).click(sel).build().perform();
	 
		 driver.close();
		 

	}

}
