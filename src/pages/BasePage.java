package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public String assertElementIsVisible;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void writeText(By elementBy, String text){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public void click(By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).click();
    }

    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertTextEquals(String expectedText, String actualText){
        Assert.assertEquals(expectedText, actualText);
    }
    public void assertElementVisible(By addToCart){
        boolean isVisible = driver.findElement(addToCart).isDisplayed();
        Assert.assertTrue(isVisible);
    }
    public int countItems(By elementBy){
        waitVisibility(elementBy);
        return driver.findElements(elementBy).size();
    }
    public void assertIntegerEquals(int expectedNumber,int actualNumber){
        Assert.assertEquals(expectedNumber, actualNumber);
    }
    public void selectDropdownOptionByValue(By elementBy, String value){
        waitVisibility(elementBy);
        Select select = new Select(driver.findElement(elementBy));
        select.selectByValue(value);
    }
    public void assertElementIsNotVisible(By remove3By){
        boolean isVisible = driver.findElement(remove3By).isDisplayed();
        Assert.assertFalse(isVisible);
}
}
