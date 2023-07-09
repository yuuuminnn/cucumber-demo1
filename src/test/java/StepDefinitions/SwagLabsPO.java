package StepDefinitions;

import Pages.LoginPage_PO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwagLabsPO {

    WebDriver driver= null;
    LoginPage_PO loginB;

    @Given("Chrome is open")
    public void chromeIsOpen() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
//        Point targetPosition = new Point(300, 600);
//        driver.manage().window().setPosition(targetPosition);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }


    @Given("userB login page is open")
    public void userbLoginPageIsOpen() {
        driver.navigate().to("https://www.saucedemo.com/");

    }

    @When("^userB enter (.*) and (.*)$")
    public void userbEnterUsernameAndPassword(String username,String password) {
        loginB = new LoginPage_PO(driver);
        loginB.inputUsername(username);
        loginB.inputPassword(password);

    }

    @And("userB click on login")
    public void userbClickOnLogin() {
        loginB.clickloginbt();
    }

    @Then("userB enter home page")
    public void userbEnterHomePage() throws InterruptedException {
        loginB.clickhomebt();
        Thread.sleep(3000);
    }

    @Then("userB click logout")
    public void userbClickLogout() throws InterruptedException {
        loginB.clicklogoutbt();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

}
