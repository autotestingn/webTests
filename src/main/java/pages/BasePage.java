package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage<T> {
    protected WebDriver driver;
    protected Actions action;
    private String pathName;
    private static final String HOSTNAME = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort");


    public BasePage(WebDriver driver, String pathName) {
        this.driver = driver;
        this.pathName = pathName;
        this.action = new Actions(driver);
    }

    public T open() {
        driver.get(HOSTNAME + (T)this.pathName);
        return (T)this;
    }

    public T pageUrlShouldBe(String url) {
        assert(driver.getCurrentUrl().equals(url));
        return (T)this;
    }
}


