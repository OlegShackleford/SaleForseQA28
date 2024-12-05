package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Description("Checking page loading")
    @Override
    public AccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'Accounts']")));
        return this;
    }

    @Description("Open Accounts page")
    public AccountPage open() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=AllAccounts");
        return this;
    }

    @Step("Open modal window")
    public NewAccountModal openModalPage() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
        return new NewAccountModal(driver);
    }

    @Step("Get company name from list")
    public String getCompanyName(String title) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//span[text() = 'Recently Viewed']")));
        String temp = String.format(("//a[@data-refid = 'recordId' and @title = '%s']"), title);
        return driver.findElement(By.xpath(temp)).getText();
    }

    @Step("Return to list of companies")
    public void returnAccountPage() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=__Recent");
    }
}
