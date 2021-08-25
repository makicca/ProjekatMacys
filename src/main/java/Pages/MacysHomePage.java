package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacysHomePage extends BasePage{
    @FindBy(id = "bd")
    WebElement macysHomePage;

    @FindBy(id = "macys-logo")
    WebElement macysLogo;

    @FindBy(id = "globalSearchInputField")
    WebElement searchProductField;

    @FindBy(id = "searchSubmit")
    WebElement searchSubmitButton;


    WebDriver driver;
    public MacysHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToMacysHomePage(){
        driver.get(StringsPage.MACYS_HOMEPAGE_URL);
    }

    public void enterProductName(){
        searchProductField.sendKeys("ralph lauren women shoes");
    }
    public void clickSubmitButton(){
        searchSubmitButton.click();
    }



}
