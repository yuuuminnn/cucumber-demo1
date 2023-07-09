package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    @FindBy(id = "react-burger-menu-btn")
    WebElement home_btn;

    @FindBy(id = "logout_sidebar_link")
    WebElement logout_btn;

    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver = driver;
//        PageFactory.initElements(driver,Homepage.class);
        PageFactory.initElements(driver,this);
    }

    public void clickhome() {
        home_btn.click();
    }

    public void clicklogout() {
        logout_btn.click();
    }
}
