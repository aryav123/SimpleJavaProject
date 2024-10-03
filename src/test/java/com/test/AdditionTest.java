package com.test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdditionTest {
	
	@Test
	public void Sum() {
		int a,b,sum;
		a=10;
		b=15;
		
		sum=a+b;
		System.out.println("Sum of A and B is:"+sum);
	}

}
