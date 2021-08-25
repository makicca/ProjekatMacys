package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleSearchResultPage extends BasePage {

    @FindBy(id="rcnt")
    WebElement results;

    WebDriver driver;
    public GoogleSearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void checkGoogleSearchResults(String text){
        wdWait.until(ExpectedConditions.visibilityOf(results));
        Assert.assertTrue(results.getText().contains(text));
    }

}
