package TestNgPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	@Test()
	public class Propertiesread {
	public static void main(String[] args) throws IOException {
	
	String path="C:\\Users\\hp\\eclipse-workspace\\MavenProject\\Excel\\abc.properties";
	FileInputStream File=new FileInputStream(path);
	
	Properties prop=new Properties();
	prop.load(File);
	
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("OperatingSystem"));
	System.out.println(prop.getProperty("Tool"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));


}
}
