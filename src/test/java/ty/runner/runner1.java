package ty.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	 @RunWith(Cucumber.class)
	 @CucumberOptions(features="src/test/java/ty/feature/Get_operation.feature",
	 					glue="step_defination/get_operation",plugin= {"pretty","json:target/cucumberreports/cucumber.json"},monochrome=true)
	 public class runner1 
	 {
	 } 

