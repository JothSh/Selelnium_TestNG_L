package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	@Test
	@Parameters("Name")
public void myName(String name) {
	System.out.println("Myname is "+ name);
}
}
