package Tests;

import Pages.LogInPage;
import Pages.MyAccountPage;
import Pages.StringsPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;

import static Pages.StringsPage.*;

public class LogInTests extends BaseTest {

    /**
     * Test - Positive log in with valid credentials
     * Steps:
     * 1. Navigate to Macy's log in site
     * 2. Click on the required email field
     * 3. Enter valid email
     * 4. Click on the required password field
     * 5. Enter valid password
     * 6. Click on sign in button
     *
     * Expected result:
     * 7.Verify that user is logged in
     */

    @Test
    public void positiveLogInTestWithValidCredentials() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.passwordFieldClick();
        logInPage.enterValidEmail(VALID_EMAIL);
        logInPage.passwordFieldClick();
        logInPage.enterPassword(VALID_PASSWORD);
        logInPage.clickSignInButtonSubmitSucces();
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue("Error. You are not logged in", currentURL.contains(MACYS_SIGNIN_URL));

    }

    /**
     * Test - Negative log in with invalid email and valid password
     * Steps:
     * 1. Navigate to Macy's log in site
     * 2. Click on the required email field
     * 3. Enter invalid email
     * 4. Click on the required password field
     * 5. Enter valid password
     * 6. Click on sign in button
     * <p>
     * Expected result:
     * 7.Verify that user is not logged in, stays on login page
     * Verify that error message is shown
     */

    @Test
    public void negativeLogInTestWithInvalidCredentials() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.passwordFieldClick();
        logInPage.enterInValidEmail(INVALID_EMAIL);
        logInPage.passwordFieldClick();
        logInPage.enterPassword(VALID_PASSWORD);
        logInPage.clickSignInButtonFailure();

        String currentPageURL = driver.getCurrentUrl();
        Assert.assertTrue("You sre not signed in. Expected url : " + MACYS_SIGNIN_URL +
                ". Actual: " + currentPageURL, currentPageURL.contains(MACYS_SIGNIN_URL));
        String currentErrorMessage = logInPage.getErrorMessage();
        Assert.assertTrue("Wrong error: Expected : " + EXPECTED_ERROR_MESSAGE + ". Actual: "
                + currentErrorMessage, currentErrorMessage.equals(EXPECTED_ERROR_MESSAGE));




    }
}
      




