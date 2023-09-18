package parametrization;

import common.ConfigTests;
import org.testng.annotations.*;

public class FactoryTest extends ConfigTests {

    private String FirstName = "";
    private String LastName = "";
    private String Gender = "";
    private String MobileNumber = "";

    public FactoryTest(String FirstName, String LastName, String Gender, String MobileNumber) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.MobileNumber = MobileNumber;
    }

    @Test
    public void fillForm() {
        FormTest.fillFormAndValidate(FirstName,LastName,Gender,MobileNumber);
    }
}
