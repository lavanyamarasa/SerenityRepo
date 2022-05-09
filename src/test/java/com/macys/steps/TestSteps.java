package com.macys.steps;

import org.jbehave.core.annotations.AfterStory;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;

import com.macys.main.TestBase;

public class TestSteps {

	@BeforeStory
	public void BeforeStories() {
		System.out.println("Before Stories execution");	
		}
	
	@AfterStory
	public void AfterStories() {
		System.out.println("After Stories execution");	
	}
	
	
	@Given("Using testNG excute in parallel mode")
	public void execute() {
		System.out.println("while Stories execution");	
		TestBase.initDriver();
	}

}
