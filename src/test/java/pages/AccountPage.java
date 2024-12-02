package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage extends BasePage{

    private final By BUTTON_NEW = By.xpath("//div[@title='New']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void openPageAccount(){
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/list?filterName=AllAccounts");
    }

    public void openModalPage(){
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text() = 'New Account']")));
    }

    public void clickButtonNew(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(BUTTON_NEW));
        driver.findElement(BUTTON_NEW).click();
    }
}
