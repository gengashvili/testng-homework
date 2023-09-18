package parametrization;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {

    public static void fillFormAndValidate(String FirstName, String LastName, String Gender, String MobileNumber) {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").sendKeys(FirstName);
        $("#lastName").sendKeys(LastName);
        $(By.xpath("//label[text()='"+ Gender +"']")).click();
        $("#userNumber").sendKeys(MobileNumber);
        $("#userForm").submit();

        String expectedStudentName = FirstName + " " + LastName;
        String actualStudentName = $(By.xpath("//td[contains(text(), 'Student Name')]/following-sibling::td[1]")).getText();

        Assert.assertEquals(actualStudentName, expectedStudentName);
    }

}
