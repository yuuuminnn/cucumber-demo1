package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PO {
    WebDriver driver;

    By tes_usename= By.id("user-name");
    By tes_password= By.id("password");
    By tes_loginbt= By.id("login-button");
    By tes_homebt= By.id("react-burger-menu-btn");
    By tes_logoutbt= By.id("logout_sidebar_link");


    public LoginPage_PO(WebDriver driver){
        this.driver = driver;
////        PageFactory.initElements(driver,LoginPage_PF.class);
//        PageFactory.initElements(driver,this);
    }

    public void inputUsername(String username){
        driver.findElement(tes_usename).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(tes_password).sendKeys(password);
    }

    public void clickloginbt(){
        driver.findElement(tes_loginbt).click();
    }

    public void clickhomebt(){
        driver.findElement(tes_homebt).click();
    }
    public void clicklogoutbt(){
        driver.findElement(tes_logoutbt).click();
    }



}
