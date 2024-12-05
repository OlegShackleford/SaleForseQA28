package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By BUTTON_WAFFLE = By.xpath("//div[@class = 'slds-icon-waffle']");
    private String DROPBOX_PATTERN = "//p[text() = '%s']";
    private String TITLE_PATTERN = "//span[@title = '%s']";

    @Step("Click to waffle button")
    public HomePage clickButtonWaffle() {
        driver.findElement(BUTTON_WAFFLE).click();
        return this;
    }

    @Step("Select dropbox menu {option}")
    public void selectDropBox(String option) {
        driver.findElement(By.xpath(String.format(DROPBOX_PATTERN, option))).click();
    }

    @Step("Get title {title}")
    public String getTitle(String title) {
        return driver.findElement(By.xpath(String.format(TITLE_PATTERN, title))).getText();
    }

    @Description("Check loading page")
    @Override
    public HomePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text() = 'Home']")));
        return this;
    }

    @Description("Open home page")
    @Override
    public HomePage open() {
        return this;
    }
}
