package tests;

import com.github.javafaker.Faker;
import dto.Account;
import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class AccountsTest extends BaseTest {

    SoftAssert softAssert = new SoftAssert();

    Faker faker = new Faker();

    Account accountTwo = Account.builder().
            accountName("Gigabyt").
            rating("Hot").
            phone(faker.phoneNumber().phoneNumber()).
            fax("fax" + faker.phoneNumber().cellPhone()).
            accountNumber(faker.number().digit()).
            build();//Пример использования DTO Lombok и Faker.

    Account account = new Account("Hot",
            "AMD", "+90903383",
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
        loginPage.
                open().
                isPageOpened().
                login();
        accountPage.
                openModalPage().
                isPageOpened().
                createAccount(account).
                clickButtonSafe();
        accountPage.returnAccountPage();
        String name = "AMD";
        assertEquals(accountPage.getCompanyName(name), "AMD", "Incorrect company name");
    }

    @Test(testName = "Check button edit at page", description = "Check button edit and rename text field")
    @Description("Check button edit and rename visible field at page:Phone,Website,Account Site")
    @Flaky
    public void checkEditButton() {
        loginPage.
                open().
                isPageOpened().
                login();
        account.setAccountName("Intel");
        account.setWebsite("intel.com");
        account.setAccountSite("Intel.com");
        accountPage.
                openModalPage().
                isPageOpened().
                createAccount(account).
                clickButtonSafe().
                clickDropdownMenu().
                clickToDropdown("Edit");
        account.setAccountName("NVIDIA");
        account.setWebsite("nvidia.com");
        account.setAccountSite("nvidiAhome.com");
        account.setPhone("009900");
        newAccountModal.createAccount(account).clickButtonSafe();

        softAssert.assertEquals(accountPage.getAccountName("NVIDIA"),
                "NVIDIA",
                "Incorrect text in field");
        softAssert.assertEquals(accountPage.getEditField("009900"),
                "009900",
                "Incorrect text in field");
        softAssert.assertAll();
    }
}
