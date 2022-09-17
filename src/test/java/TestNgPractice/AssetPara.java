package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssetPara {
	
	@Parameters({"browser","user","password"})
	@Test
	public void Assert(@Optional("chrome")String browser,@Optional("Admin")String user,@Optional("admin123")String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = null;
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println("Input value is incorrect");
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		Thread.sleep(2000);
		SoftAssert soft=new SoftAssert();
		String Expected = "OrangHRM";
		String ActualTitle = driver.getTitle();
		soft.assertEquals(ActualTitle, Expected);

		
		WebElement Username=driver.findElement(By.name("username"));
		WebElement password1=driver.findElement(By.name("password"));

		Username.sendKeys("Admin");
		password1.sendKeys("admin123");
		
		WebElement LogBut=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		soft.assertTrue(LogBut.isDisplayed());
		LogBut.click();
		
		
		
		
		
		
		
		
		
//		driver.close();
		
	}

}
