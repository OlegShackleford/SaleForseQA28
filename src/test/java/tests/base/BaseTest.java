package tests.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewAccountModal;

import java.time.Duration;

//@Listeners(TestListener.class)
public class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public AccountPage accountPage;
    public NewAccountModal newAccountModal;
    public HomePage homePage;


    @Parameters({"browser"}) // Задаем параметр, который будет открывать выбранный браузер по умолчанию.
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("start-maximized");
            firefoxOptions.addArguments("--disable-notifications");
            driver = new FirefoxDriver(firefoxOptions);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--disable-notifications");
            driver = new EdgeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        newAccountModal = new NewAccountModal(driver);
        homePage = new HomePage(driver);
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()){
////            AllureUtils.takeScreenshot(driver);
//        }
//        driver.quit();
//    }
}
