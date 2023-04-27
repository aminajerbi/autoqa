package run;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@tag",
		features="src/test/features/sprint3/fcb3.feature",
		glue="sprint3",
		publish=true,
		plugin={"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report"}
		
		)
public class Runner {

		
}
