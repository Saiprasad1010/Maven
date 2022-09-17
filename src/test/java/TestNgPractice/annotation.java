package TestNgPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class annotation {
	
	@Test (priority=1)
	
	public void PageUp() {
		System.out.println("PageUp");
	}
	
	
	@Test (priority=2)
	public void PageDown() {
		System.out.println("PageDown");
		
	}
}
