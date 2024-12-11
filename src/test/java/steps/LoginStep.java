package steps;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStep {

    LoginPage loginPage;
    private final String USER_NAME = "tborodich@tms.sandbox";
    private final String PASSWORD = "Password001";

    public LoginStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public void login() {
        loginPage.
                open().
                isPageOpened().
                login(USER_NAME,PASSWORD);
    }
}
