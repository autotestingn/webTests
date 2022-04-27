package tests;

import components.UserBlock;

import org.testng.annotations.Test;
import pages.UserListPage;
import pages.UserPage;
import utils.Util;


public class UITests extends BaseTest {
    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId1() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }

    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId2() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }

    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId3() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }

    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId4() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }

    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId5() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }

    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId6() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }

    @Test(description = "Проверка нажатия на блок пользователя с id и открытия страницы для этого пользователя")
    public void clickUserBlockByRandomId7() throws InterruptedException {
        UserListPage mainPage = new UserListPage(driver);
        mainPage.open();
        UserBlock userBlock = new UserBlock(driver);
        int max = 100; // Максимальное число для диапазона от 0 до max
        int rnd = Util.rnd(max);
        String hostname = System.getProperty("frontHostname") + ":" + System.getProperty("frontPort") + "/";
        UserPage userPage = userBlock.clickUserBlockByUserId(rnd);
        userPage.pageUrlShouldBe(hostname + rnd);
        Thread.sleep(1000);
    }
}
