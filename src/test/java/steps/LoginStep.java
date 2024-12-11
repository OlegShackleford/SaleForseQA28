package steps;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStep {

    LoginPage loginPage;
    private String USER_NAME = "";
    private String PASSWORD = "";

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
