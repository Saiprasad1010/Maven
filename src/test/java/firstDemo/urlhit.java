package firstDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class urlhit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); //browser setup
		WebDriver driver=new ChromeDriver(); //up casting
		driver.get("https://www.google.com/");  // to hit particular url 
		String D=driver.getCurrentUrl();
		System.out.println(D);
		
		String S=driver.getTitle();
		System.out.println(S);
		
		String s=driver.getPageSource();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		 
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		String A=driver.getCurrentUrl();
		System.out.println(A);
		
		driver.close();
		driver.quit();
	}
	}


