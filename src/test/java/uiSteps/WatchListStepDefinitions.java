package uiSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.WatchListPage;


public class WatchListStepDefinitions extends BaseSteps{

    String[] stocksForWatch= {"Bitcoin","Litecoin","Ethereum","Tether","XRP"};
    HomePage homePage = new HomePage(driver);
    WatchListPage watchListPage = new WatchListPage(driver);


    @When(":Add some random cryptocurrencies to watchlist")
    public void add_random_cryptocurrencies_to_watchlist() {
        homePage.addCurrencyToWatchList(stocksForWatch); }


    @Then(":Open the watchlist in a different tab")
    public void open_watchlist_in_a_new_tab () {
        homePage.openWatchListInANewTab();
    }

    @Then(":Verify the currencies selected are added to the watchlist")
    public void verifyCurrenciesAddedAreDisplayed() {
        for (int i=0; i<stocksForWatch.length; i++){
            Assert.assertTrue("the currency :"+stocksForWatch[i]+" is not displayed",
                    watchListPage.verifyCurrenciesAddedAreDisplayed(stocksForWatch[i]) );
        }

    }


}
