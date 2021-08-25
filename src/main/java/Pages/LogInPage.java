package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage{

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(xpath = "//*[@id=\"pw-input\"]")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"sign-in\"]")
    WebElement signInSubmitButton;

    @FindBy(className = "message")
    WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"ul-msg-section\"]/div/div/div[2]/div/p")
    WebElement errorMessageContainer;

    @FindBy(xpath = "//*[@id=\"profile-panel\"]/div/div[1]/div[1]")
    WebElement welcomeMessage;


    WebDriver driver;
    public LogInPage(WebDriver driver){
        driver.get(StringsPage.MACYS_SIGNIN_URL);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LogInPage enterValidEmail(String validEmail) {
        emailField.sendKeys("mariya.markovich.mm@gmail.com");
        return this;
    }

    public void passwordFieldClick(){
        passwordField.click();
    }

     public LogInPage enterPassword(String validPassword) {
         passwordField.sendKeys("07062020Vasa");
         return this;
    }

    public MacysHomePage clickSignInButtonSubmitSucces(){
        signInSubmitButton.click();
        return new MacysHomePage(driver);
    }

    public LogInPage enterInValidEmail(String inValidEmail) {
        emailField.sendKeys("mariya.markovich@gmail.com");
        return this;
    }

    public String getErrorMessage(){
        String errorMessage = errorMessageContainer.getText();
        return errorMessage;
    }

    public LogInPage clickSignInButtonFailure(){
        signInSubmitButton.click();
        return this;
    }









}
