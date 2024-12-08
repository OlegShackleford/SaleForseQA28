package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By BUTTON_WAFFLE = By.xpath("//div[@class = 'slds-icon-waffle']");
    private String DROPBOX_PATTERN = "//p[text() = '%s']";
    private String TITLE_PATTERN = "//span[@title = '%s']";
    private By TITLE_HOME = By.xpath("//span[text() = 'Home']");

    @Step("Click to waffle button")
    public HomePage clickButtonWaffle() {
        driver.findElement(BUTTON_WAFFLE).click();
        return this;
    }

    @Step("Select dropbox menu {option}")
    public void selectDropBox(String option) {
        log.info("Selection option of dropbox '{}'",option);
        driver.findElement(By.xpath(String.format(DROPBOX_PATTERN, option))).click();
    }

    @Step("Get title {title}")
    public String getTitle(String title) {
        log.info("Get title: '{}'",title);
        return driver.findElement(By.xpath(String.format(TITLE_PATTERN, title))).getText();
    }

    @Description("Check loading page")
    @Override
    public HomePage isPageOpened() {
        log.info("Get home title: '{}'",driver.findElement(TITLE_HOME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE_HOME));
        return this;
    }

    @Step("Open home page")
    @Override
    public HomePage open() {
        log.info("Open homepage");
        return this;
    }
}
