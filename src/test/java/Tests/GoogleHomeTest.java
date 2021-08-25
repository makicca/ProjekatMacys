package Tests;

import Pages.GoogleHomePage;
import Pages.GoogleSearchResultPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomeTest extends BaseTest{

    /**
     * Test - Finding Macy's page using Google search
     * Steps:
     * 1. Navigate to Google home page
     * 2. Enter text in the search field
     * 3. Click on the google search button
     *
     * Expected result:
     * 4.Verify that Macy's page is in the search results
     */

    @Test
    public void searchGoogleTest(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        String text = "Macy's";
        googleHomePage.navigateToGoogleHomePage();
        googleHomePage.enterTextInTheSearchField(text);
        googleHomePage.clickOnSearchButton();
        GoogleSearchResultPage searchResults = new GoogleSearchResultPage(driver);
        searchResults.checkGoogleSearchResults(text);
    }

    }
