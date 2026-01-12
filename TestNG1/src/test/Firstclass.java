package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firstclass {
	
	@AfterTest
	public void Demo() {
		
		System.out.println("First Program for demo");
	}
	
	
	@BeforeTest
	public void show() {
		
		System.out.println("First Program for show");
	}
	
	@Test
	public void login() {
		
		System.out.println("First Program for login");
	}
	
	@Test(enabled=false)
	public void logout() {
		
		System.out.println("First Program for logout");
	}

}
