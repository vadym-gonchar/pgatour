package locators;

import org.openqa.selenium.By;

public class PgaTourFeedLocators {
  public By everythingTab = By.xpath("//a[contains(text(),'EVERYTHING')]");
  public By newsTab = By.xpath("//li[@class='omnitureTab']//a[contains(text(),'NEWS')]");
  public By videosTab = By.xpath("//a[contains(text(),'VIDEOS')]");
  public By socialTab = By.xpath("//a[contains(text(),'SOCIAL')]");
  public By photosTab = By.xpath("//a[contains(text(),'PHOTOS')]");
}