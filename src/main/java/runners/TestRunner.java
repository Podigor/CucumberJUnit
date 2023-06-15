package runners;

import configuration.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",//path to feature files
        glue = "steps",//package path
        tags = "@Certificate",//list feature files for run
        dryRun = false,
        publish = true


)
public class TestRunner {
    @BeforeClass
    public static void create() {
        System.setProperty("CUCUMBER_PUBLISH_ENABLED", "943f2e6f-68e5-43a4-9507-cc53c4d0d778");
        BaseClass.create();
    }

    @AfterClass
    public static void end() throws InterruptedException {
        BaseClass.end();
    }
}
