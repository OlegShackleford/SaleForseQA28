package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AccountsTest extends BaseTest {

    @Test
    public void checkCreateAccount() {
        loginPage.openLoginPage();
        loginPage.login();
        accountPage.openModalPage();

        newAccountModal.createAccount("Hot", "Nvidia", "+984957550055",
                "fax:984957550055", "1444", "www.nvidia.com", "www.homePageNvdia",
                "NVDA", "Other", "Public", "Other", "10",
                "2", "343", "bobaStreet", "BibaStreet",
                "Astana", "KZ", "12345", "America", "Los-santos",
                "Kalyga", "34567", "Poland", "Low", "Gold",
                "345", "Yes", "00004", "No", "bla ba bla");
    }
}
