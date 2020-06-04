package helpers;

import locators.LogInAndOutPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Initiation {

  WebDriver driver;
  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();
  ElementsHelper elementsHelper = new ElementsHelper(driver);
  public Initiation(WebDriver driver){
    this.driver = driver;
  }

  public String loginURL = "https://www.pgatour.com/";
  public String login = "vadym.gonchar@omnigon.com";
  public String password = "123qwe";

  public void init(){
    driver.findElement(logInAndOutPageLocators.loginModal).click();
    elementsHelper.waitForElementPresence(logInAndOutPageLocators.loginField, 10);
    elementsHelper.waitForElementPresence(logInAndOutPageLocators.passwordField, 10);
    //driver.findElement(logInAndOutPageLocators.loginField).sendKeys(login);
    //driver.findElement(logInAndOutPageLocators.passwordField).sendKeys(password);
    driver.findElement(logInAndOutPageLocators.signInButton).submit();
  }
}