package StepDefinitions;

import Pagefactory.Homepage;
import Pagefactory.LoginPage_PF;
import io.cucumber.java.en.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwagLabsPF {
    WebDriver driver =null;
    LoginPage_PF login;
    Homepage home;
    @Given("brower is open")
    public void browerIsOpen() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        Point targetPosition = new Point(300, 600);
        driver.manage().window().setPosition(targetPosition);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    }
    @Given("login page is open")
    public void login_page_is_open() {
        driver.navigate().to("https://www.saucedemo.com");
    }

    @When("^user enter (.*) and (.*)$")
    public void enterUsernameAndPassword(String username,String password) {
        login =new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
    }
    @When("user click on login")
    public void user_click_on_login() throws InterruptedException {
        login =new LoginPage_PF(driver);
        login.clicklogin();
        Thread.sleep(2000);
    }

    @Then("user enter home page")
    public void userEnterHomePage() {
        home = new Homepage(driver);
        home.clickhome();
    }

    @Then("user click logout")
    public void userClickLogout() throws InterruptedException {
        home = new Homepage(driver);
        Thread.sleep(2000);
        home.clicklogout();
        driver.close();
        driver.quit();
        System.out.println("logout success");
    }
}
