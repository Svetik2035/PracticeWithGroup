package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageBase.PageBase;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;


public class LoginPage extends PageBase {


    @FindBy(id = "prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    private WebElement errorMsg;

    public String getInvalidUsernameMsg(){
        return errorMsg.getText();
    }

    public void loginAsStoreManager85(){
        BrowserUtilities.waitInSeconds(2);
        username.sendKeys(ConfigurationReader.getProperty("store_manager_username"));

        password.sendKeys(ConfigurationReader.getProperty("store_manager_password"), Keys.ENTER);
        BrowserUtilities.waitInSeconds(3);
    }

    public void manualLogin(String name, String password){
        this.username.sendKeys(name);
        this.password.sendKeys(password, Keys.ENTER);
        BrowserUtilities.waitInSeconds(3);
    }


}
