package TestNgPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class annotationPractice {
	
	@Test(priority=1)
	public void LogIn() {
		System.out.println("LogIn");
	}
	
	@Test(priority=2)
	public void LogOut() {
		System.out.println("Logout");
	}
	

}
