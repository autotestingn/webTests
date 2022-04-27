package pages;

import org.openqa.selenium.WebDriver;


public class UserListPage extends BasePage<UserListPage> {
    private static final String PATH_NAME = "/";

    public UserListPage(WebDriver driver) {
        super(driver, PATH_NAME);
    }
}
