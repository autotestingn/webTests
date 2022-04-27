package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public abstract class BaseComponent<T> {
    protected WebDriver driver;

    protected Actions action;


    public BaseComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        this.action = new Actions(driver);

    }

}
