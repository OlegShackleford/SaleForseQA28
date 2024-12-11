package pages;

import dto.Account;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

@Log4j2
public class NewAccountModal extends BasePage {

    private final By BUTTON_SAFE = By.xpath("//*[@name='SaveEdit']");
    private final String GET_TITLE = "//span[text() = 'Accounts']";

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Description("Checking page loading")
    @Override
    public NewAccountModal isPageOpened() {
        log.info("Method isPageOpened");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GET_TITLE)));
        return this;
    }

    @Step("Open New modal account window")
    @Override
    public NewAccountModal open() {
        log.info("Open new modal page");
        return this;
    }

    @Step("Write field in new account")
    public NewAccountModal createAccount(Account account) {
        log.info("Create new account into modal window");

        if (account.getAccountName() != null) {
            new Input(driver, "Account Name").write(account.getAccountName());
        }
        if (account.getRating() != null) {
            new Picklist(driver, "Rating").select(account.getRating());
        }
        if (account.getPhone() != null) {
            new Input(driver, "Phone").write(account.getPhone());
        }
        if (account.getFax() != null) {
            new Input(driver, "Fax").write(account.getFax());
        }
        if (account.getAccountNumber() != null) {
            new Input(driver, "Account Number").write(account.getAccountNumber());
        }
        if (account.getWebsite() != null) {
            new Input(driver, "Website").write(account.getWebsite());
        }
        if (account.getAccountSite() != null) {
            new Input(driver, "Account Site").write(account.getAccountSite());
        }
        if (account.getTickerSymbol() != null) {
            new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        }
        if (account.getType() != null) {
            new Picklist(driver, "Type").select(account.getType());
        }
        if (account.getOwnership() != null) {
            new Picklist(driver, "Ownership").select(account.getOwnership());
        }
        if (account.getIndustry() != null) {
            new Picklist(driver, "Industry").select(account.getIndustry());
        }
        if (account.getEmployees() != null) {
            new Input(driver, "Employees").write(account.getEmployees());
        }
        if (account.getAnnualRevenue() != null) {
            new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        }
        if (account.getSicCode() != null) {
            new Input(driver, "SIC Code").write(account.getSicCode());
        }
        if (account.getBillingStreet() != null) {
            new Textarea(driver, "Billing Street").write(account.getBillingStreet());
        }
        if (account.getShippingStreet() != null) {
            new Textarea(driver, "Shipping Street").write(account.getShippingStreet());
        }
        if (account.getBillingCity() != null) {
            new Input(driver, "Billing City").write(account.getBillingCity());
        }
        if (account.getState() != null) {
            new Input(driver, "Billing State/Province").write(account.getState());
        }
        if (account.getBillingZip() != null) {
            new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        }
        if (account.getBillingCountry() != null) {
            new Input(driver, "Billing Country").write(account.getBillingCountry());
        }
        if (account.getShippingCity() != null) {
            new Input(driver, "Shipping City").write(account.getShippingCity());
        }
        if (account.getStateProvince() != null) {
            new Input(driver, "Shipping State/Province").write(account.getStateProvince());
        }
        if (account.getShippingZip() != null) {
            new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        }
        if (account.getShippingCountry() != null) {
            new Input(driver, "Shipping Country").write(account.getShippingCountry());
        }
        if (account.getCustomerPriority() != null) {
            new Picklist(driver, "Customer Priority").select(account.getCustomerPriority());
        }
        if (account.getSLA() != null) {
            new Picklist(driver, "SLA").select(account.getSLA());
        }
        if (account.getSLASerialNumber() != null) {
            new Input(driver, "SLA Serial Number").write(account.getSLASerialNumber());
        }
        if (account.getNumberOfLocations() != null) {
            new Input(driver, "Number of Locations").write(account.getNumberOfLocations());
        }
        if (account.getUpsellOpportunity() != null) {
            new Picklist(driver, "Upsell Opportunity").select(account.getUpsellOpportunity());
        }
        if (account.getActive() != null) {
            new Picklist(driver, "Active").select(account.getActive());
        }
        if (account.getDescription() != null) {
            new Textarea(driver, "Description").write(account.getDescription());
        }
        return this;
    }

    @Step("Click to button save")
    public AccountPage clickButtonSafe() {
        log.info("Click to button safe");
        driver.findElement(BUTTON_SAFE).click();
        return new AccountPage(driver);
    }
}
