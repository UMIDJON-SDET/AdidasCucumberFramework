package com.demoblaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",       //json report
                "html:target/cucumber-report.html",  //cucumber report
                 "rerun:target/return.txt"},         //rerun test
        features = "src/test/resources/features",    // feature directory path
        glue = "com/demoblaze/step_definitions",     // step_definition package path
        dryRun = false,                              //
        tags = "@smoke"                                //

)
public class CukesRunner {

}


