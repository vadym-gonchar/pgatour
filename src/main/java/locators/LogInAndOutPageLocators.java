package locators;

import org.openqa.selenium.By;

public class LogInAndOutPageLocators {
  public By loginModal = By.xpath("//div[@class='login-button log-in']");
  public By loginField = By.cssSelector("#gigya-loginID-42512649484830184");
  public By passwordField = By.xpath("//input[@id='gigya-password-122670099552285500']");
  public By signInButton = By.
          xpath("//form[@id='gigya-login-form']//input[@class='gigya-input-submit']");
  public By dropdown = By.xpath("//b[@class='caret icon-chevron-down']");
  public By signOutButton = By.xpath("//a[contains(text(),'Logout')]");

}