package Kony.JenkinsPratice;

import org.testng.annotations.Test;

public class DemoTest {
	
	
	@Test //(groups={"smoke","regression"})
	public void m1(){
		
		System.out.println("hi am m1 method in jenkins");
	}
	
	@Test
	public void m2(){
		
		System.out.println("hi am m2 method in jenkins");
	}
}
