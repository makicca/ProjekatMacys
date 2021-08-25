package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleHomePage extends BasePage {

    @FindBy(name = "q")
    WebElement searchField;

    @FindBy(name = "btnK")
    WebElement searchButton;


    WebDriver driver;
    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToGoogleHomePage(){
        driver.get(StringsPage.GOOGLE_HOMEPAGE_URL);
    }

    public void enterTextInTheSearchField(String text){
    wdWait.until(ExpectedConditions.visibilityOf(searchField));
    searchField.sendKeys(text);

    }
    public void clickOnSearchButton(){
    wdWait.until(ExpectedConditions.visibilityOf(searchButton));
    searchButton.click();

    }




}




