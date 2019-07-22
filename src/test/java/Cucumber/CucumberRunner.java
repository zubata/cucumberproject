package Cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"rgs","sber","basic"},
        plugin = {"pretty"},
        tags = {"@rgs","@sber"}
)
public class CucumberRunner {

}
