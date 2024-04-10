package com.stepdefnition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "com.stepdefnition",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/report.html","json:target/report2json","junit:target/report3.xml"})
public class RunnerClass {

}
