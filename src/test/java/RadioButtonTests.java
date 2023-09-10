import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

public class RadioButtonTests extends ConfigTests{

    @BeforeClass
    public void setUpClass() {
        baseUrl = "https://demoqa.com";
        reportsFolder = "src/main/resources/RadioButtonFailedTests";
    }


    @Test
    public void radioButton() {
        open("/radio-button");

        SoftAssert softAssert = new SoftAssert();

        SelenideElement yesButton = $("label[for='yesRadio']");

        yesButton.click();

        softAssert.fail();

        SelenideElement noButton = $("#noRadio");

        softAssert.assertTrue(noButton.isEnabled());

        softAssert.assertAll();
    }


}
