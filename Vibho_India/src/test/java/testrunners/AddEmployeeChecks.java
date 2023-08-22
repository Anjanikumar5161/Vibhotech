package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/addemployeechecks.feature",glue="stepdefinitions",dryRun=false,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/addEmployeechecks.html"})
public class AddEmployeeChecks 
{

}
