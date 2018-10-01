package stepsDefinitions;

import config.ConfigDriver;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

import java.util.List;

public class dataTableSteps extends ConfigDriver {


    @Given("^user enters different emails$")
    public void user_enters_different_emails(DataTable arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<List<String>>data = arg1.raw();
        driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("email")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("email")).sendKeys(data.get(1).get(0));
        driver.findElement(By.id("email")).sendKeys(data.get(1).get(1));
        Thread.sleep(5000);
    }
}
