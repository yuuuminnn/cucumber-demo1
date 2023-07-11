package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
    WebDriver driver;

    By filterbt = By.xpath("//*[@class=\"product_sort_container\"]");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
////        PageFactory.initElements(driver,LoginPage_PF.class);
//        PageFactory.initElements(driver,this);
    }

    public void clickfilterbt() {
        driver.findElement(filterbt).click();
    }

    public void filterAtoZ() {
        Select select = new Select(driver.findElement(filterbt));
        select.selectByValue("az");

    }

    public void filterZtoA() {
        Select select = new Select(driver.findElement(filterbt));
        select.selectByValue("za");

    }

    public void filterLtoH() {
        Select select = new Select(driver.findElement(filterbt));
        select.selectByValue("lohi");

    }

    public void filterHtoL() {
        Select select = new Select(driver.findElement(filterbt));
        select.selectByValue("hilo");

    }
}
