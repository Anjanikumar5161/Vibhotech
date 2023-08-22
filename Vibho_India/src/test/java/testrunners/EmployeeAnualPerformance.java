package testrunners;

import org.junit.jupiter.api.Tags;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/employee_AnnualPerformance.feature",glue="stepdefinitions",dryRun=false,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/EmployeeAnnualPerformance.html",})
public class EmployeeAnualPerformance
{

}
