package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Picklist {

    WebDriver driver;
    String label;
    String pickListPattern = "//label[text()='%s']//ancestor::lightning-picklist";
    WebDriverWait wait;

    public Picklist(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void select(String option) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format(pickListPattern + "//button", label))));

        WebElement dropdown = driver.findElement(By.xpath(String.format(pickListPattern + "//button", label)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdown); //Принудительно кликаем на dropDown

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format(pickListPattern +
                "//lightning-base-combobox-item//span[text()='%s']", label, option))));

        WebElement optionElement = driver.findElement(By.xpath(String.format(pickListPattern +
                "//lightning-base-combobox-item//span[text()='%s']", label, option)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionElement);//Принудительно кликаем на опцию
    }
}
