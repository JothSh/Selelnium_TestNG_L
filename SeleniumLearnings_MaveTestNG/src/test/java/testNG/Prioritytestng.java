package testNG;

import org.testng.annotations.Test;

public class Prioritytestng {

	@Test (priority =1)
	public void firstGear() {
		System.out.println("Car is on first gear ");
	}
	@Test(priority =2)
	public void secondGear() {
		System.out.println("Car is on second gear ");
	}
	@Test(priority =3)
	public void thirdGear() {
		System.out.println("Car is on third gear ");
	}
	@Test(priority =4)
	public void fourthGear() {
		System.out.println("Car is on fourth gear ");
	}
	
	
	
	
}
