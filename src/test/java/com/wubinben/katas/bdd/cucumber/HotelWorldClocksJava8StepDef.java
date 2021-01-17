package com.wubinben.katas.bdd.cucumber;

import cucumber.api.java8.En;

import static org.junit.Assert.assertEquals;

public class HotelWorldClocksJava8StepDef implements En {
    private final HotelWorldClocksFacade hotelWorldClocksFacade;


    public HotelWorldClocksJava8StepDef() {
        hotelWorldClocksFacade = HotelWorldClocksFacade.newInstance();

        Given("^a hotel lobby has five clocks$", () -> {
            this.hotelWorldClocksFacade.testInitialization();
        });
        And("^\"([^\"]*)\" is in the DST period$", (String cityName) -> {
            this.hotelWorldClocksFacade.addACityWithDstStatus(cityName, DaylightSavingTime.ACTIVE);
        });
        And("^\"([^\"]*)\" does not use the DST$", (String cityName) -> {
            this.hotelWorldClocksFacade.addACityWithDstStatus(cityName, DaylightSavingTime.INACTIVE);
        });
        When("^I adjust the incorrect time of the clock of \"([^\"]*)\" to be (\\d+)$", (String cityName, Integer hour) -> {
            this.hotelWorldClocksFacade.adjustIncorrectTimeOfCity(hour, cityName);
        });
        Then("^the time of the clock of \"([^\"]*)\" should be (\\d+)$", (String cityName, Integer expectedHour) -> {
            assertEquals("The result hour is not the same with the expected hour", Integer.toString(expectedHour), this.hotelWorldClocksFacade.getResultHour(cityName));
        });
        And("^the DST period of \"([^\"]*)\" ends$", (String cityName) -> {
            this.hotelWorldClocksFacade.addACityWithDstStatus(cityName, DaylightSavingTime.INACTIVE);
        });
        And("^the DST period of \"([^\"]*)\" does not end$", (String cityName) -> {
            this.hotelWorldClocksFacade.addACityWithDstStatus(cityName, DaylightSavingTime.ACTIVE);
        });
        When("^I adjust the time of the clock of \"([^\"]*)\" to be (\\d+) due to the end of DST$", (String cityName, Integer hour) -> {
            this.hotelWorldClocksFacade.adjustIncorrectTimeOfCity(hour, cityName);
        });
    }
}
