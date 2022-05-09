package com.macys.run;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.testng.annotations.Test;

import com.macys.steps.TestSteps;



public class ConfigurationRun  extends JUnitStories{
	
	 @Override
	 public Configuration configuration() {
	      return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader())).useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE));
	  }
	   
	 @Override
	  public List<CandidateSteps> candidateSteps() {
	      return new InstanceStepsFactory(configuration(), new TestSteps(), this).createCandidateSteps();
	  }
	      
	  @Override
	  protected List<String> storyPaths() {
		  List<String> stories= new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()), "**/*.story", "**/excluded*.story");
	      return stories;
	  }
	   
	  @Override
	  @Test
	  public void run() throws Throwable {
		  System.out.println("Test started");
	      super.run();
	  }
		


}
