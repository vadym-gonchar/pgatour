package pgatTests;

import locators.PgaTourFeedLocators;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PgaTourFeed extends TestBase {
  PgaTourFeedLocators pgaTourFeedLocators = new PgaTourFeedLocators();

  @Test(priority = 1, groups = "uitest")
  public void pgaTourFeedTest() {

    Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(pgaTourFeedLocators.everythingTab,
            10), "EVERYTHING");
    Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(pgaTourFeedLocators.newsTab,
            10), "NEWS");
    Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(pgaTourFeedLocators.videosTab,
            10), "VIDEOS");
    Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(pgaTourFeedLocators.socialTab,
            10), "SOCIAL");
    Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(pgaTourFeedLocators.photosTab,
            10), "PHOTOS");
  }
}