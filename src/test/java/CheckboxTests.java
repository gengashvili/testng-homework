import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

public class CheckboxTests extends ConfigTests{

    @BeforeClass
    public void setUpClass() {
        reportsFolder = "src/main/resources/CheckboxFailedTests";
    }


    @Test(groups = {"FrontEnd"})
    public void checkboxes(){
        open("https://the-internet.herokuapp.com/checkboxes");

        SelenideElement checkBoxesForm = $("#checkboxes");

        uncheckCheckbox(checkBoxesForm);
        softAssert.fail();

        checkCheckbox(checkBoxesForm);
        softAssert.fail();

        softAssert.assertAll();
    }

    @Test(groups = {"BackEnd"})
    public void exampleTest() {
        open("https://www.google.com/");

        String actualTitle = title();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    private void uncheckCheckbox(SelenideElement form) {
        SelenideElement input = form.$("input[type=checkbox]:checked");
        input.setSelected(false);
    }

    private void checkCheckbox(SelenideElement form) {
        SelenideElement input = form.$("input[type=checkbox]:not(:checked)");
        input.setSelected(true);
    }
}
