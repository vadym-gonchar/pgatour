package helpers;

import locators.LogInAndOutPageLocators;
import org.openqa.selenium.WebDriver;

public class Initiation {

  WebDriver driver;

  public Initiation(WebDriver driver) {
    this.driver = driver;
  }

  ElementsHelper elementsHelper;
  LogInAndOutPageLocators logInAndOutPageLocators;

  public String loginURL = "https://www.pgatour.com/";
  public String login = "vadym.gonchar@omnigon.com";
  public String password = "123qwe";

  public void init() {
    elementsHelper = new ElementsHelper(driver);
    logInAndOutPageLocators = new LogInAndOutPageLocators();

    driver.findElement(logInAndOutPageLocators.loginButton).click();
    elementsHelper.waitForElementPresence(logInAndOutPageLocators.loginModal, 10);
    driver.findElement(logInAndOutPageLocators.loginField).sendKeys(login);
    driver.findElement(logInAndOutPageLocators.passwordField).sendKeys(password);
    driver.findElement(logInAndOutPageLocators.signInButton).submit();
    elementsHelper.scrollToMiddle();
  }
}