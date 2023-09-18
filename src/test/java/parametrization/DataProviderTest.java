package parametrization;

import common.ConfigTests;
import org.testng.annotations.*;

public class DataProviderTest extends ConfigTests {

    @Test(dataProvider = "fillFormData", dataProviderClass = FormDataProvider.class)
    public void fillForm(String FirstName, String LastName, String Gender, String MobileNumber) {
        FormTest.fillFormAndValidate(FirstName,LastName,Gender,MobileNumber);
    }

}
