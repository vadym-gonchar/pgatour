package pgatTests;

import helpers.Browsers;
import helpers.ElementsHelper;
import helpers.Initiation;
import io.github.bonigarcia.wdm.WebDriverManager;
import locators.LogInAndOutPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

public class TestBase {

  WebDriver driver;
  ElementsHelper elementsHelper;
  Initiation initiation;
  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();

  @BeforeGroups(groups = {"uitest"})
  @Parameters("browser")
  public void setUp(Browsers browser) {

    WebDriverManager.chromedriver().setup();
    switch (browser) {
      case CHROME:
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        break;
      case FIREFOX:
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        break;
      case IE11:
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        break;
      case EDGE:
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        break;
      case OPERA:
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        break;
      default:
        throw new RuntimeException("Invalid specified browser: " +
                browser + ", expected one of 'CHROME', 'FIREFOX', 'EDGE', 'IE11', 'OPERA'");
    }
    elementsHelper = new ElementsHelper(driver);
    initiation = new Initiation(driver);

    driver.navigate().to(initiation.loginURL);
    driver.manage().window().fullscreen();
    initiation.init();
  }

  @AfterGroups(groups = {"uitest"})
  public void logout() {
    elementsHelper.scrollToBottom();
    elementsHelper.clickElement(logInAndOutPageLocators.manageProfile, 10);
    elementsHelper.clickElement(logInAndOutPageLocators.logout, 10);
    if (driver != null)
      driver.quit();
  }
}