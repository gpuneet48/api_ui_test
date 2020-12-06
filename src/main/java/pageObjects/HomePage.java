package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class HomePage {

    WebDriver localDriver;

    String XPATH_WatchListStarIcon = "//p[text()=\"%s\"]/ancestor::node()[5]//*[@class=\"icon-Star\"]";

    public HomePage(WebDriver driver) {
        this.localDriver= driver;
        PageFactory.initElements(localDriver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'cmc-table-homepage')]/tbody/tr")
    private List<WebElement> entries;

    @FindBy(how= How.XPATH, using = "//span[text()='Watchlist']")
    private WebElement watchListTab;


    public int getAllEntries() {
        int value= entries.size();
        return value;
    }

    public void addCurrencyToWatchList(String[] currencyList) {
        for (int i = 0; i < currencyList.length; i++) {
            //click on star for each currency to add it in watchlist
            localDriver.findElement(By.xpath(String.format(XPATH_WatchListStarIcon, currencyList[i]))).click();
        }
    }

    public WatchListPage openWatchListInANewTab(){
        Actions actions = new Actions(localDriver);
        actions.keyDown(Keys.CONTROL).moveToElement(watchListTab).click().keyUp(Keys.CONTROL).perform();

        ArrayList<String> tabs = new ArrayList<String> (localDriver.getWindowHandles());
        localDriver.switchTo().window(tabs.get(1)); //switches to new tab

        return new WatchListPage(localDriver);
    }


}