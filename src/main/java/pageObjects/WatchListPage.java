package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class WatchListPage {

    WebDriver localDriver;

    public WatchListPage(WebDriver driver) {
        this.localDriver= driver;
        PageFactory.initElements(localDriver, this);
    }

    String XPATH_Currency = "//p[text()=\"%s\"]";

    public boolean verifyCurrenciesAddedAreDisplayed(String currencyList ){
       boolean isCurrencyDisplayed=  localDriver.findElement(By.xpath(String.format(XPATH_Currency,currencyList))).isDisplayed();
       return isCurrencyDisplayed;

    }

}
