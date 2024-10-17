package testNG;

import org.testng.annotations.Test;

public class GroupingExample {


@Test (groups= {"Apple"})
public void Apple(){
System.out.println("Kasheri apple");
}
@Test (groups= {"Apple"})
public void Apple1() {
System.out.println("Apple grade 2");
}
@Test (groups= {"Orange"})
public void Orange1() {
System.out.println("Im grade 1 orange");
}
@Test (groups= {"Orange"})
public void Orange2() {
System.out.println("Im grade 2 orange");
}
}