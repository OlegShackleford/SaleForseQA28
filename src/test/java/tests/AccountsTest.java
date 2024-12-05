package tests;

import dto.Account;
import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AccountsTest extends BaseTest {

    Account account = new Account("Hot",
            "AMD",
            "+984957550055",
            "fax:984957550055",
            "1444",
            "www.nvidia.com",
            "www.homePageNvdia",
            "NVDA",
            "Other",
            "Public",
            "Other",
            "10",
            "2",
            "343",
            "bobaStreet",
            "BibaStreet",
            "Astana",
            "KZ",
            "12345",
            "America",
            "Los-santos",
            "Kalyga",
            "34567",
            "Poland",
            "Low",
            "Gold",
            "345",
            "Yes",
            "00004",
            "No",
            "bla ba bla");

    @Test(testName = "Create new account", description = "Create new account in modal window")
    @Description("Check create new account in modal window with all field." +
            " And find account name in list at account page")
    @Flaky
    public void checkCreateAccount() {
        loginPage.open().isPageOpened().login();
        accountPage.openModalPage().isPageOpened().createAccount(account).clickButtonSafe();
        accountPage.returnAccountPage();
        String name = "AMD";
        Assert.assertEquals(accountPage.getCompanyName(name), "AMD", "Incorrect company name");
    }
}
