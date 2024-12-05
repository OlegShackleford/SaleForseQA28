package pages;

import dto.Account;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountModal extends BasePage {

    private final By BUTTON_SAFE = By.xpath("//*[@name='SaveEdit']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Description("Checking page loading")
    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'Accounts']")));
        return this;
    }

    @Description("Open New modal account window")
    @Override
    public NewAccountModal open() {
        return this;
    }

    @Step("Write field in new account")
    public NewAccountModal createAccount(Account account) {
        new Picklist(driver, "Rating").select(account.getRating());
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountSite());
        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        new Picklist(driver, "Type").select(account.getType());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Picklist(driver, "Industry").select(account.getIndustry());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "SIC Code").write(account.getSicCode());
        new Textarea(driver, "Billing Street").write(account.getBillingStreet());
        new Textarea(driver, "Shipping Street").write(account.getShippingStreet());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing State/Province").write(account.getState());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZip());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping State/Province").write(account.getStateProvince());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZip());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new Picklist(driver, "Customer Priority").select(account.getCustomerPriority());
        new Picklist(driver, "SLA").select(account.getSLA());
        new Input(driver, "SLA Serial Number").write(account.getSLASerialNumber());
        new Input(driver, "Number of Locations").write(account.getNumberOfLocations());
        new Picklist(driver, "Upsell Opportunity").select(account.getUpsellOpportunity());
        new Picklist(driver, "Active").select(account.getActive());
        new Textarea(driver, "Description").write(account.getDescription());
        return this;
    }

    @Step("Click to button save")
    public void clickButtonSafe() {
        driver.findElement(BUTTON_SAFE).click();
    }
}
