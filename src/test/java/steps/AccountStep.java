package steps;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.AccountPage;
import pages.LoginPage;
import pages.NewAccountModal;

@Log4j2
public class AccountStep {

    LoginPage loginPage;
    AccountPage accountPage;
    NewAccountModal newAccountModal;
    private String USER_NAME = "";
    private String PASSWORD = "";

    public AccountStep(WebDriver driver) {
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        newAccountModal = new NewAccountModal(driver);
    }

    public void createAccount(Account account) {
        log.info("Account '{}'", account);
        loginPage.
                open().
                isPageOpened().
                login(USER_NAME,PASSWORD);
        accountPage.
                open().
                isPageOpened().
                openModalPage();
        newAccountModal.
                createAccount(account).
                clickButtonSafe();
    }
}
