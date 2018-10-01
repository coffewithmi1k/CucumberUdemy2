package stepsDefinitions;

import config.ConfigDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class ScenarioOutline extends ConfigDriver {

    @Given("^user inserts \"([^\"]*)\"$")
    public void user_inserts(String arg1) throws Exception {

    }

    @Given("^user inserts \"([^\"]*)\" email$")
    public void user_inserts_email(String arg1) throws Exception {
        driver.findElement(By.id("email")).sendKeys(arg1);

    }

    @Given("^user inserts \"([^\"]*)\" password$")
    public void user_inserts_password(String arg1) throws Exception {
        driver.findElement(By.id("passwd")).sendKeys(arg1);
        Thread.sleep(3000);
    }
}
