package create.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SONU\\eclipse-workspace\\BDDproject2\\create.feature",
                 glue={"/BDDproject2/src/test/java/create/stepDefinition"},
                 plugin={"pretty","html:target/htmlreports"})


public class CreateFirst {

}