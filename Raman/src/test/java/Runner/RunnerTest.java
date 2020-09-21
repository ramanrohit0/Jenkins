package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"C:/SopraSpace/Raman/pom.xml"},glue={"Steps"},
		plugin = {"html:testoutput.html"})


public class RunnerTest {

}
