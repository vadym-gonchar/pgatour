package locators;

import org.openqa.selenium.By;

public class LogInAndOutPageLocators {
  public By loginButton = By.xpath("//div[@class='login-button log-in']");
  public By loginModal = By.cssSelector("#gigya-modal-plugin-container-showScreenSet_content");
  public By loginField = By.cssSelector("[name='username']");
  public By passwordField = By.cssSelector("[name='password']");
  public By signInButton = By.cssSelector(".gigya-input-submit");
  public By manageProfile = By.xpath("//a[@class='login-button logged-in']//img");
  public By logout = By.xpath("//a[@class='gigya-composite-control gigya-composite-control-link " +
          "js-logout gigya-screen-navigation'][contains(text(),'Logout')]");
}