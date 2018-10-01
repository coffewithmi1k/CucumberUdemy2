package stepsDefinitions;

import config.ConfigDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends ConfigDriver {


    @Before()
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).
                toRealPath() + "\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    @Given("^User Opens website$")
    public void user_Opens_website() {
        driver.get("http://automationpractice.com");
    }


    @Given("^verifies website is opened$")
    public void verifies_website_is_opened() {
        Assert.assertTrue(driver.getTitle().contains("My Store"));
    }

    @Given("^User clicks on LoginButton$")
    public void user_clicks_on_LoginButton() {
        driver.findElement(By.xpath("//a [@class='login']"))
                .click();
    }

    @Given("^user fills \"([^\"]*)\" as email$")
    public void user_fills_as_email(String arg1) {
        driver.findElement(By.id("email")).sendKeys(arg1);
    }

    @Given("^user fills \"([^\"]*)\" as password$")
    public void user_fills_as_password(String arg1) {
        driver.findElement(By.id("passwd")).sendKeys(arg1);
    }

    @Given("^user clicks Log In button$")
    public void user_clicks_Log_In_button() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^verifies user is logged In successfully$")
    public void verifies_user_is_logged_In_successfully() throws Exception {
        Assert.assertTrue(
                driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout='" +
                        " and @title='Log me out']")).getText().contains("Sign out"));
        Thread.sleep(2000);
    }
}
