package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    @FindBy(id="myRewardsLabel")
    WebElement signInButton;

    public static WebDriver driver = new ChromeDriver();
    public static WebDriverWait wdWait = new WebDriverWait(driver, 20);


    }



