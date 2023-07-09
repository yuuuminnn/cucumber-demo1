//package Hookstep;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.*;


//public class SetupDriver {
//    WebDriver driver = null;
//    @Before(order=0)
//    public void setupDriver(){
//        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        System.setProperty("webdriver.chrome.driver", "Y:/cucumber-demo1/src/test/resources/Driver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        System.out.println("Before Scenario Complete0");WebDriver driver = null;
////    @Before(order=0)
////    public void setupDriver(){
////        System.setProperty("webdriver.http.factory", "jdk-http-client");
////        System.setProperty("webdriver.chrome.driver", "Y:/cucumber-demo1/src/test/resources/Driver/chromedriver.exe");
////        driver = new ChromeDriver();
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
////        System.out.println("Before Scenario Complete0");
//    }
//    @Before(order=1)
//    public void setDriver2(){
//        System.out.println("Before Scenario Complete1");
//    }

//    @After(order=0)
//    public void quitDriver(){
//        driver.close();
//        driver.quit();
//        System.out.println("After Scenario Complete1");
//    }
//
//    @After(order=2)
//    public void quitDriver2(){
//        System.out.println("After Scenario Complete2");
//    }
//
//    @BeforeStep
//    public void bforeSetp1(){
//        System.out.println("BeforeStep");
//    }
//    @AfterStep
//    public void  AfterSetp1(){
//        System.out.println("AfterStep");
//    }
//
//    @Before(value ="@condition")
//    public void beforecondition(){
//        System.out.println("condition is working！");
//    }
//}


