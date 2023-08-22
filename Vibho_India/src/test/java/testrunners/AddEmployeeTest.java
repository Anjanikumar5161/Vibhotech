package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/addemployee.feature",glue="stepdefinitions",dryRun=false,
plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/addemployeeresult.html"})
public class AddEmployeeTest 
{

}
