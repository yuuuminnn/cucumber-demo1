package Hookstep;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SwagTest {
    WebDriver driver = null;
    @Before
    public void setupDriver(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "Y:/cucumber-demo1/src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @After
    public void quitDriver(){
        driver.close();
        driver.quit();
    }

    @Given("open url and login")
    public void open_url_and_login() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.getPageSource().contains("Products");
        Thread.sleep(3000);
    }

    @When("add product to cart")
    public void addProductToCart() throws InterruptedException {
        Thread.sleep(3000);
        WebElement selector = driver.findElement(By.xpath("//select[@id='0']")); //Selector 表示定位的元素
        Select select = new Select(selector);
        select.selectByValue("hilo");
        driver.findElement(By.xpath("//*[@class=\"product_sort_container\"]")).click();
        driver.findElement(By.xpath("//*[@name=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    }

    @And("go to Cart and Checkout")
    public void goToCartAndCheckout() {
        driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
        if (driver.getPageSource().contains("Your Cart")){
            driver.findElement(By.xpath("//*[@name=\"checkout\"]")).click();
        } else {
            driver.findElement(By.xpath("//*[@class=\"shopping_cart_link\"]")).click();
        }
    }

    @Then("input rceiving address")
    public void inputRceivingAddress() {


    }
}
