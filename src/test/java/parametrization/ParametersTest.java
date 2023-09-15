package parametrization;

import common.ConfigTests;
import org.testng.annotations.*;

public class ParametersTest extends ConfigTests {

    @Parameters({"FirstName","LastName","Gender","MobileNumber"})
    @Test
    public void fillForm(String FirstName, String LastName, String Gender, String MobileNumber) {
        FormTest.fillFormAndValidate(FirstName,LastName,Gender,MobileNumber);
    }

}
