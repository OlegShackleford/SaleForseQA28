package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    private final By DROPDOWN_MENU = By.xpath("//lightning-button-menu[@class =" +
            " 'menu-button-item slds-dropdown-trigger slds-dropdown-trigger_click']");
    private String DROPDOWN_OPTION = "//*[@title = '%s']";
    private String EDITABLE_FIELD = "//a[text() = '%s']";
    private String ACCOUNT_NAME = "//lightning-formatted-text[text() = '%s']";
    private String TITLE = "//span[text() = 'Accounts']";
    private String LINK = "https://tms9-dev-ed.develop.lightning.force.com/" +
            "lightning/o/Account/list?filterName=AllAccounts";
    private String MODAL_WINDOW = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new";
    private final By RECENTLY_VIEWED = By.xpath("//span[text() = 'Recently Viewed']");
    private String COMPANY_NAME = "//a[@data-refid = 'recordId' and @title = '%s']";
    private String RETURN_TO_LIST_OF_COMPANY = "https://tms9-dev-ed.develop.lightning.force.com/lightning/o" +
            "/Account/list?filterName=__Recent";

    @Step("Get account name")
    public String getAccountName(String name) {
        log.info("Account name is: '{}'", name);
        return driver.findElement(By.xpath(String.format(ACCOUNT_NAME, name))).getText();
    }

    @Step("Get new text from field after change {field}")
    public String getEditField(String field) {
        log.info("Edit field: '{}'", field);
        return driver.findElement(By.xpath(String.format(EDITABLE_FIELD, field))).getText();
    }

    @Step("Click to dropdown menu")
    public AccountPage clickDropdownMenu() {
        log.info("Click dropdown");
        wait.until(ExpectedConditions.elementToBeClickable(DROPDOWN_MENU));

        WebElement webElement = driver.findElement(DROPDOWN_MENU);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", webElement);
        return this;
    }

    @Step("Choose option id dropdown menu {option}")
    public AccountPage clickToDropdown(String option) {
        log.info("Selection option: '{}'", option);
        String xPath = String.format(DROPDOWN_OPTION, option);
        driver.findElement(By.xpath(xPath)).click();
        return this;
    }

    @Description("Checking page loading")
    @Override
    public AccountPage isPageOpened() {
        log.info("Method isPageOpened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TITLE)));
        return this;
    }

    @Step("Open Accounts page")
    public AccountPage open() {
        log.info("Open account page");
        driver.get(LINK);
        return this;
    }

    @Step("Open modal window")
    public NewAccountModal openModalPage() {
        log.info("Open modal page");
        driver.get(MODAL_WINDOW);
        return new NewAccountModal(driver);
    }

    @Step("Get company name from list {title}")
    public String getCompanyName(String title) {
        log.info("Get company name: '{}'", title);
        wait.until(ExpectedConditions.visibilityOfElementLocated(RECENTLY_VIEWED));
        String temp = String.format((COMPANY_NAME), title);
        return driver.findElement(By.xpath(temp)).getText();
    }

    @Step("Return to list of companies")
    public void returnAccountPage() {
        log.info("Return to accounts page");
        driver.get(RETURN_TO_LIST_OF_COMPANY);
    }
}
