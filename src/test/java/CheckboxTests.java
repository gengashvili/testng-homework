import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

public class CheckboxTests extends ConfigTests{

    @BeforeClass
    public void setUpClass() {
        baseUrl = "https://the-internet.herokuapp.com";
        reportsFolder = "src/main/resources/CheckboxFailedTests";
    }


    @Test
    public void checkboxes(){
        open("/checkboxes");

        SelenideElement checkBoxesForm = $("#checkboxes");

        uncheckCheckbox(checkBoxesForm);
        softAssert.fail();

        checkCheckbox(checkBoxesForm);
        softAssert.fail();

        softAssert.assertAll();
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
