package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountModal extends BasePage {

    private final By BUTTON_SAFE = By.xpath("//*[@name='SaveEdit']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }



    public void createAccount(String rating, String accountName, String phone, String fax, String accountNumber,
                              String website, String accountSite, String tickerSymbol, String type, String ownership,
                              String industry, String employees, String annualRevenue, String sicCode,
                              String billingStreet, String shippingStreet, String billingCity, String state,
                              String billingZip, String billingCountry, String shippingCity, String stateProvince,
                              String shippingZip, String shippingCountry, String customerPriority, String SLA,
                              String numberOfLocations, String active, String SLASerialNumber,
                              String upsellOpportunity, String description) {
        new Picklist(driver, "Rating").select(rating);
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);

        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Ownership").select(ownership);
        new Picklist(driver, "Industry").select(industry);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new Textarea(driver, "Billing Street").write(billingStreet);
        new Textarea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing State/Province").write(state);
        new Input(driver, "Billing Zip/Postal Code").write(billingZip);
        new Input(driver, "Billing Country").write(billingCountry);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping State/Province").write(stateProvince);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZip);
        new Input(driver, "Shipping Country").write(shippingCountry);
        new Picklist(driver, "Customer Priority").select(customerPriority);
        new Picklist(driver, "SLA").select(SLA);
        new Input(driver, "SLA Serial Number").write(SLASerialNumber);
        new Input(driver, "Number of Locations").write(numberOfLocations);
        new Picklist(driver, "Upsell Opportunity").select(upsellOpportunity);
        new Picklist(driver, "Active").select(active);
        new Textarea(driver, "Description").write(description);
    }

    public void clickButtonSafe() {
        driver.findElement(BUTTON_SAFE).click();
    }
}
