package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

@Log4j2
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
        try{wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));}
        catch (TimeoutException e){
            log.error(e.getMessage());
            Assert.fail("Login page dont open");
        }

        return this;
    }

    @Step("Open login page")
    public LoginPage open() {
        log.info("Open login page");
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
        return this;
    }

    @Step("Input field to login")
    public void login() {
        log.info("log in using credential: User name '{}' Password '{}'",USER_NAME,PASSWORD);
        driver.findElement(USER_INPUT).sendKeys(USER_NAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
