package com.wubinben.katas.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:com/wubinben/katas/bdd/cucumber/hotel_world_clocks.feature" })
public class RunCukesTest {
}
