import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

public class RadioButtonTests extends ConfigTests{

    @BeforeClass
    public void setUpClass() {
        reportsFolder = "src/main/resources/RadioButtonFailedTests";
    }


    @Test(groups = {"FrontEnd"}, priority = 1)
    public void radioButton() {
        open("https://demoqa.com/radio-button");

        // უშუალოდ ინფუთზე ვერ ეკლიკებოდა, მგონი css დან ზომები ისეა გაწერილი რომ ლეიბლი ზემოდან ეფარება ინფუთს
        // და რაკი ლეიბლი ინფუთისთვისაა განკუთვნილი ირიბად ამ გზითაც ეკლიკება
        selectYesOption("label[for='yesRadio']");

        softAssert.fail();

        checkNoOption("#noRadio");

        softAssert.assertAll();
    }

    @Test(groups = {"BackEnd"}, priority = 2)
    public void exampleTest() {
        open("https://www.google.com/");

        String actualTitle = title();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    private void selectYesOption(String selector) {
        SelenideElement yesOption = $(selector);
        yesOption.click();
    }

    private void checkNoOption(String selector) {
        SelenideElement noRadio = $(selector);
        //დეფოლტად რაც მიყენია timeout აქ მაგდენი არ არის საჭირო და მაგიტომ ვამცირებ
        noRadio.should(enabled, Duration.ofSeconds(4));
    }


}
