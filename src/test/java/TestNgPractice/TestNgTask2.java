package TestNgPractice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


		
public class TestNgTask2 {
	
	WebDriver driver;
	
	@BeforeTest 
	public void BrowserSet() throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.getTitle();
	}
	
	@Test (priority=1, description= "Here we click on LOGIN symbol" )
	public void loginbt() {
	WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"));
	login.click();
	}
	
	@Test  (priority=2, description= "here we click on register button")
	public void registerbt() {
	WebElement register=driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]"));
	register.click();
	System.out.println("register complete");
	}
	
	@Test  (priority=3, description = "Here we find out iframe to manage that perticular fram to make further actions")
	public void Iframe() throws InterruptedException {
	Thread.sleep(3000);
	WebElement iframe=driver.findElement(By.xpath("//iframe[@id='loginIframe']"));
	driver.switchTo().frame(iframe);
	System.out.println("Iframe get successfully");
	}
	
	@Test  (priority=4, description = "here we enter Mobile number")
	public void mono() throws InterruptedException {
	Thread.sleep(3000);
	WebElement mobilenum=driver.findElement(By.xpath("/html/body/div/div/div/div[6]/form/div/input"));
	mobilenum.sendKeys("8788269600");
	System.out.println("mobile number enter");
	}
	
	@Test  (priority=5, description = "Here we click on Continue button")
	public void continuebt() throws InterruptedException {
	Thread.sleep(3000);
	WebElement continuebut=driver.findElement(By.xpath("//button[@id='checkUser']"));
	continuebut.click();
	System.out.println("continue");
	} 
	
	@Test  (priority=6, description = "Here we insert email id to registration")
	public void emailin() throws InterruptedException {
	Thread.sleep(3000);
	WebElement email=driver.findElement(By.xpath("//input[@id='j_username_new']"));
	email.sendKeys("subhgadupatil@gmail.com");
	System.out.println("email entered");
	}
	
	@Test  (priority=7, description = "Here we enter our name")
	public void namein() throws InterruptedException {
	Thread.sleep(3000);
	WebElement name=driver.findElement(By.xpath("//input[@id='j_name']"));
	name.sendKeys("Saiprasad");
	System.out.println("Name entered correct");
	}
	
	@Test  (priority=8, description = "Here we enter our Date of Birth")
	public void DOBin() throws InterruptedException {
	Thread.sleep(3000);
	WebElement DOB=driver.findElement(By.xpath("//input[@id='j_dob']"));
	DOB.clear();
	DOB.sendKeys("27/02/1997");
	System.out.println("DOB entered");
	}
	
	@Test  (priority=9, description = "Here we enter valid password with required credentials")
	public void passwordin() throws InterruptedException {
	Thread.sleep(3000);
	WebElement password=driver.findElement(By.xpath("//input[@id='j_password']"));
	password.sendKeys("S@ip1010");
	System.out.println("password");
	}
	
	@Test  (priority=10, description = "Here we click on Continue button")
	public void clickcont() throws InterruptedException {
	Thread.sleep(3000);
	WebElement continuebut1=driver.findElement(By.xpath("//button[@id='userSignup']"));
	continuebut1.click();
	System.out.println("continue");	
	}
	
	@AfterTest
	public void LogOut() {
		driver.close();	
	}
}
