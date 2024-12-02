package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private final By USER_INPUT = By.id("username");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");
    private final String USER_NAME = "tborodich@tms.sandbox";
    private final String PASSWORD = "Password001";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

   public void openLoginPage(){
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com");
   }

   public void login(){
        driver.findElement(USER_INPUT).sendKeys(USER_NAME);
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
        driver.findElement(LOGIN_BUTTON).click();
   }
}
