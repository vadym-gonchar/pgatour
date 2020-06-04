package helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsHelper {
  WebDriver driver;
  public ElementsHelper(WebDriver driver) {
    this.driver = driver;
  }

  public String getTextOfElement(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.elementToBeClickable(element));
      return driver.findElement(element).getText();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT " +
              "found or it is NOT clickable: " + element, e);
    }
  }
  public void waitForElementPresence(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(element)));
      wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(element)));
      driver.findElement(element).sendKeys("vadym.gonchar@omnigon.com");
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element is NOT found or it is NOT visible: " + element, e);
    }
  }

  public String getElementTextVisibilityOf(By element, int timeout) {
    WebElement webElement;
    try {
      webElement = (new WebDriverWait(driver, Duration.ofSeconds(timeout))).
              until(ExpectedConditions.visibilityOfElementLocated(element));
      return webElement.getText();

    } catch (StaleElementReferenceException e) {
      webElement = (new WebDriverWait(driver, Duration.ofSeconds(timeout))).
              until(ExpectedConditions.visibilityOfElementLocated(element));
      return webElement.getText();

    } catch (NoSuchElementException e) {
      throw new RuntimeException("Web element is not present within given timeout"
              + element + " Time " + timeout, e);

    } catch (WebDriverException e) {
      return driver.findElement(element).getText();
    }
  }

}
