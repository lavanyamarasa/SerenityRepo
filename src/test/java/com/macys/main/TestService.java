package com.macys.main;


public class TestService {


	public void Test1() {
		TestBase.initDriver();
	}
	
	
	public void Test2() {
		TestBase.initDriver();
	}
	
	public void Test3() {
		TestBase.initDriver(); 
	}
		
	public void Test4() {
		TestBase.initDriver();
		System.out.println("Test4 execution " + Thread.currentThread().getId());	

	}
	
	public void Test5() {
		TestBase.initDriver();
		System.out.println("Test5 execution " + Thread.currentThread().getId());	
	}
}
