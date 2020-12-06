package uiSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseSteps {

    @Before("@browser")
    public void startBrowser(){
        openBrowser();
    }

    @After("@browser")
    public void closeBrowser(){
        quitBrowser();
    }


}

