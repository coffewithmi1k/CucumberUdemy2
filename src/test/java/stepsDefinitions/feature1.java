package stepsDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class feature1 {



    @Given("^Say something$")
    public void say_something() throws Exception {
        System.out.println("asd");
    }

    @Given("^verify something$")
    public void verify_something() throws Exception {
        System.out.println("asd");

    }
}
