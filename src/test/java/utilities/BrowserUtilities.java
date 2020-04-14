package utilities;

import org.openqa.selenium.WebDriver;

public class BrowserUtilities {
    private WebDriver driver = Driver.getDriver();

    // wait
    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
