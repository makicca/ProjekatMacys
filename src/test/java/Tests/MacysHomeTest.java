package Tests;

import Pages.InventoryPage;
import Pages.MacysHomePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MacysHomeTest extends BaseTest{
    /**
     * Test - Search product and sort search results by price(low to high)
     * Steps:
     * 1. Navigate to Macy's home site
     * 2. Click on the search product field
     * 3. Enter product name
     * 4. Click on search button
     * 5. Click on dropdown sort button
     * 6. Sort search results by price
     *
     * Expected result:
     * 7.Verify that all products are sorted by price (low to high)
     */

    @Test
    public void searchAndSortProductByPrice(){
        MacysHomePage macysHomePage = new MacysHomePage(driver);
        macysHomePage.navigateToMacysHomePage();
        macysHomePage.enterProductName();
        macysHomePage.clickSubmitButton();
        wdWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("cell"))));
        InventoryPage inventoryPage = new InventoryPage(driver);
        WebElement inventoryList = driver.findElement(By.className("cell"));
        List<WebElement> listOfItems = inventoryList.findElements(By.xpath("//*[@id=\"shop_all\"]/div[2]/div/ul/li/div/div[9]/ul"));
        WebElement firstElement = listOfItems.get(0);
        String firstPriceUnsorted = firstElement.findElement(By.xpath("//*[@id=\"10380832\"]/div[3]/div[2]/div[1]/div[2]/div[2]/span")).getText();
        System.out.println("First item price is " + firstPriceUnsorted);
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"sortBy\"]")));
       // dropdown.selectByVisibleText("Price: Low to High");

        WebElement firstOption = dropdown.getFirstSelectedOption();
        String elementText = firstOption.getText();
        List<WebElement>listOfItemsInDropDown = dropdown.getOptions();
        WebElement dropDownAsWebElement = driver.findElement(By.xpath("//*[@id=\"sortBy\"]"));
        dropDownAsWebElement.click();
        listOfItemsInDropDown.get(2).click();












    }
}
