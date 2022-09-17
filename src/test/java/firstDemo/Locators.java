package firstDemo;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.devtools.v102.runtime.model.ConsoleAPICalled.Type;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 WebElement email=driver.findElement(By.id("ap_email"));
		 System.out.println(email);
		 
		 email.sendKeys("8308731321");
		 
		 WebElement contbutton=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		 contbutton.click();
		 
		 WebElement password=driver.findElement(By.name("password"));
		 System.out.println(password);
		 password.sendKeys("S@ip1010");
		 
		 WebElement LogButton=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		 LogButton.click();
		
		 
		
				 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		SimpleDateFormat format=new SimpleDateFormat("DD-MM-YYYY HH-mm-ss");
		Date date=new Date();
		String actualDate=format.format(date);
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File ("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\src/TestNg.png");
		FileUtils.copyFile(Source, des);
		
		driver.close();
		
				
				
				
		 
		 
	}

}
