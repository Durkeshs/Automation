package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.step",plugin = {"json:target/cucumber-repor/a.json"},tags= {"~@smoke","~@sanity"},monochrome=true,dryRun=false)
public class TestRunner {
	@AfterClass
public  static void report() {

}
}

