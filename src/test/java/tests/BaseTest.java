package tests;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

    /*@BeforeClass
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void beforeTest() {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        driver = webDriverFactory.getWebDriver(DriverType.CHROME);
        setUpDriverSession();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void setUpDriverSession() {
        driver.manage().window().maximize();
    }*/

    @BeforeClass
    public void setup() {
        System.out.println("Test fixtures");
        Map<String, Object> selenoidOptions = new HashMap<>();
        selenoidOptions.put("enableVNC", Boolean.parseBoolean(System.getProperty("selenoidEnableVnc")));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", System.getProperty("browserName"));
        capabilities.setCapability("browserVersion", System.getProperty("browserVersion"));
        capabilities.setCapability("selenoid:options", selenoidOptions);
        try {
            driver = new RemoteWebDriver(
                    URI.create(System.getProperty("webdriverUrl")).toURL(),
                    capabilities
            );
        } catch (Exception ignored) {

        }
    }

   @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
