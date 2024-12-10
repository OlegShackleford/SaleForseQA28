package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class HomeTest extends BaseTest {

    @Test(testName = "Verify of drop-box menu", description = "Check a drop-down menu")
    @Description("Checking the operation of buttons in a drop-down menu and verification of the title")
    public void checkButtonWaffle() {
        loginPage.open().isPageOpened().login();
        homePage.isPageOpened().clickButtonWaffle().selectDropBox("Community");
        String actualTitle = homePage.getTitle("Community");
        assertEquals(actualTitle, "Community", "Incorrect title");
    }
}
