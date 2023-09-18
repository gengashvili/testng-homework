package common;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Configuration.*;

public class ConfigTests {
    protected static SoftAssert softAssert = new SoftAssert();
    @BeforeSuite
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        browserCapabilities = options;
        browserSize = null;
        timeout = 10000;
        holdBrowserOpen = false;
    }
}
