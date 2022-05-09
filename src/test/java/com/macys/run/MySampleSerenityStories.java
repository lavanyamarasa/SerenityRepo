package com.macys.run;

import java.util.List;

import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.testng.annotations.Test;
import com.macys.steps.TestSteps;
import net.serenitybdd.jbehave.SerenityStories;


public class MySampleSerenityStories extends SerenityStories {	   
	   
	 @Override
	  public List<CandidateSteps> candidateSteps() {
	      return new InstanceStepsFactory(configuration(), new TestSteps(), this).createCandidateSteps();
	  }
	
	  @Override
	  @Test
	  public void run() throws Throwable {
		  System.out.println("Test started");
	      super.run();
	  }
		
}
