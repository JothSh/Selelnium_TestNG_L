package testNG;

import org.testng.annotations.Test;

public class EnabledTestNg {

	@Test (priority = 1)
	public void anirudh() {
		System.out.println("Playing anirudh song");
		
	}
	@Test (priority = 2)
	public void arrahman() {
		System.out.println("Playing arrahman song");
		
	}
	@Test (priority = 3,enabled=false)
	public void shanthosh() {
		System.out.println("Playing shanthosh song");
		
	}
	@Test (priority = 4)
	public void u1() {
		System.out.println("Playing u1 song");
		
	}
	
}
