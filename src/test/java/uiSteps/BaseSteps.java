package uiSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BaseSteps {

   public static  WebDriver driver ;

    public void openBrowser() {

        String currentDir = System.getProperty("user.dir");
        Properties prop = new Properties();
        try {
            InputStream is = new FileInputStream(currentDir + "\\src\\main\\resources\\config.properties");
            prop.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.setProperty("webdriver.gecko.driver", currentDir + "\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", currentDir + "\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver", currentDir + "\\IEDriverServer.exe");

        String browser = prop.getProperty("browser");

        switch (browser.toLowerCase()) {
            case "ff":
                driver = new FirefoxDriver();
                break;
            case "ch":
                driver = new ChromeDriver();
                break;
            case "ie":
                DesiredCapabilities caps= new DesiredCapabilities();
                caps.setCapability("ignoreZoomSetting" , true);
                driver = new InternetExplorerDriver(caps);
                break;
        }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

    }


    public void quitBrowser(){
        driver.quit();

    }


}

