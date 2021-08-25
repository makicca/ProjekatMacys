package Tests;

import Pages.BasePage;
import org.junit.After;
import org.junit.Before;

public class BaseTest extends BasePage {

    @Before
    public void testInit(){
        driver.manage().window().maximize();
    }
    @After
    public void testTearDown(){
       driver.quit();
   }
}
