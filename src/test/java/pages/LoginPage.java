package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By USER_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");
    private final String USER_NAME = "tborodich@tms.sandbox";
    private final String PASSWORD = "Password001";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        return this;
    }

    @Step("Open login page")
    public LoginPage open() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
        return this;
    }

    @Step("Input field to login")
    public void login() {
        driver.findElement(USER_INPUT).sendKeys(USER_NAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
