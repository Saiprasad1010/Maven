package firstDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class urlhit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String D=driver.getCurrentUrl();
		System.out.println(D);
		
		String S=driver.getTitle();
		System.out.println(S);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		 
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		String A=driver.getCurrentUrl();
		System.out.println(A);
		
		
		
		driver.close();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver1=new EdgeDriver();
//		driver1.get("https://ycmou.digitaluniversity.ac/");
//		driver1.close();
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver2=new FirefoxDriver();
//		driver2.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
//		driver2.close();

	}

	private static Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
