package Hookstep;

import io.cucumber.java.en.*;

public class Hookstep {
    @Given("step1")
    public void step1() {
        System.out.println("setp1");
    }

    @When("step2")
    public void step2() {
        System.out.println("setp2");
    }

    @And("step3")
    public void step3() {
        System.out.println("setp3");
    }

    @Then("step4")
    public void step4() {
        System.out.println("setp4");
    }
}
