package firstDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framehandling {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 driver.manage().window().maximize();
		 WebElement FrameHand=driver.findElement(By.id("name"));
		 
		 FrameHand.sendKeys("Saiprasad");
		 Thread.sleep(2000);
		 driver.switchTo().frame(FrameHand.findElement(By.id("frm1")));
		 
		 Select FH=new Select (driver.findElement(By.id("course")));
		 FH.selectByVisibleText("Java");
		 Thread.sleep(3000);

		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("name")).sendKeys("Patil");
		 
		 
		 
	}

}
