import com.codeborne.selenide.*;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.SoftAsserts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Configuration.*;

@Listeners({SoftAsserts.class, ScreenShooter.class})
public class ConfigTests {

    private WebDriver driver;
    protected static SoftAssert softAssert = new SoftAssert();


    @BeforeSuite
    public void setUpSuite() {
        timeout = 10000;
        savePageSource = false;
        screenshots = true;
        assertionMode = AssertionMode.SOFT;
    }

    @BeforeMethod
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}
