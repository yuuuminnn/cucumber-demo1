package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckTestUrl {
    WebDriver driver = null;
    @Given("Open chrome and open url")
    public void openchrome() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
        driver.navigate().to("https://www.baidu.com/");
//        driver.get("https://www.baidu.com/");
    }

    @When("user input search parameters")
    public void user_input_search_parameters() throws InterruptedException {
        driver.findElement(By.id("s-top-loginbtn")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__userName\"]")).sendKeys("18971478484");
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__password\"]")).sendKeys("Buhao2011@");
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__submit\"]")).click();
        Thread.sleep(2000);
        driver.getPageSource().contains("枫沓慧");
        driver.findElement(By.name("wd")).sendKeys("BOSS直聘");
        Thread.sleep(2000);
    }


    @And("click search butten")
    public void click_search_butten() throws InterruptedException {
        driver.findElement(By.name("wd")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("valid search deatils")
    public void valid_search_deatils() {
        driver.getPageSource().contains("BOSS直聘——找工作，上BOSS直聘，直接谈！");
        driver.close();
        driver.quit();
    }

}
