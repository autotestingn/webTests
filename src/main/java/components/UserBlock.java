package components;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.UserPage;

import java.util.List;

public class UserBlock extends BaseComponent<UserBlock> {
    @FindBy(xpath = "//div[contains(@class, 'MuiCard-root')]/a")
    List<WebElement> userBlocks;

    public UserBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Нажимаем на блок пользователя с id = {userId}")
    public UserPage clickUserBlockByUserId(int userId) {
        userBlocks.get(userId).click();
        return new UserPage(driver, String.valueOf(userId));
    }
}
