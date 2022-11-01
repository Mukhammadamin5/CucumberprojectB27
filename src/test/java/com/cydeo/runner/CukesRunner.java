package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt" ,
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "src/test/resources",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@scenarioOutLinePractice"
)
public class CukesRunner {
}
