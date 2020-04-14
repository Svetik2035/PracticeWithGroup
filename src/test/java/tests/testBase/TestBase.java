package tests.testBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        String URL = ConfigurationReader.getProperty("qa1");
        Driver.getDriver().get(URL);
        BrowserUtilities.waitInSeconds(5);

    }

    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();
    }
}
