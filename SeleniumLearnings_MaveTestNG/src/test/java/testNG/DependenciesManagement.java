package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test (enabled=true)
	public void tenthStandard() {
		System.out.println("Studing tenth standard");
	}
	
	@Test (dependsOnMethods="tenthStandard")
	public void higherSecondary() {
		System.out.println("Studing higher secondary");
	}
	@Test (dependsOnMethods="higherSecondary")
	public void college() {
		System.out.println("Studing college");
	}
	
	
}
