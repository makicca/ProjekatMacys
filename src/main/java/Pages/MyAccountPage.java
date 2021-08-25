package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyAccountPage extends BasePage{

    @FindBy(id = "my-account-home")
    WebElement myAccountHomePage;

    @FindBy(xpath = "//*[@id=\"profile-panel\"]/div/div[1]/div[1]")
    WebElement welcomeMessage;

    WebDriver driver;
    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void checkMyAccountPage(){
        wdWait.until(ExpectedConditions.elementToBeSelected(myAccountHomePage));
        myAccountHomePage.isDisplayed();
    }


}

