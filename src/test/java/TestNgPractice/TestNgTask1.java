package TestNgPractice;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTask1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void BrowserSet() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test (priority = 1, invocationCount=1)
	public void title() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test (priority=2,description= "this method use to enter correct credintials in given web elements")
	public void LogIn() {
		WebElement Username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));

		Username.sendKeys("Admin");
		password.sendKeys("admin123");
	}
	
	@Test (priority = 3, dependsOnMethods = "LogIn")
	public void LogBut() {
		WebElement LogBut=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		LogBut.click();
	}
	
	@Test (priority = 4, dependsOnMethods="LogBut")
	public void MyInfo() {
		 WebElement myinfo=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
 	     myinfo.click();
	}
	
	@Test (priority = 5, dependsOnMethods = "MyInfo")
	public void getname() {
		 WebElement name = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']"));
		 String gn= name.getText();
		 System.out.println(gn);
	}
	
	@Test (priority = 6, dependsOnMethods="getname")
	public void screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		File des=new File ("C:\\Users\\hp\\eclipse-workspace\\MavenProject\\src/TestNg.png");
		FileUtils.copyFile(Source,des);
		
	}
	
	@AfterTest
	public void TearUp() {
		driver.close();
	}
	

}
