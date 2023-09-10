import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

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

        SoftAssert softAssert = new SoftAssert();

        SelenideElement checkedBox = $("#checkboxes input[type=checkbox]:checked");
        SelenideElement uncheckedBox = $("#checkboxes input[type=checkbox]:not(:checked)");

        uncheckCheckbox(checkedBox);
        softAssert.fail();

        checkCheckbox(uncheckedBox);
        softAssert.fail();

        softAssert.assertAll();
    }


    private void uncheckCheckbox(SelenideElement element) {
        if (element.isSelected()) {
            element.setSelected(false);
        } else {
            System.out.println("element is already unchecked");
        }
    }

    private void checkCheckbox(SelenideElement element) {
        if (!element.isSelected()) {
            element.setSelected(true);
        } else {
            System.out.println("element is already checked");
        }
    }
}
