package parametrization;

import org.testng.annotations.DataProvider;

public class FormDataProvider {

    @DataProvider
    public static Object[][] fillFormData() {
        return new Object[][] {
                {"FirstName1", "LastName1", "Male", "5937918311"},
                {"FirstName2", "LastName2", "Female", "5937918312"},
                {"FirstName3", "LastName3", "Other", "5937918313"}
        };
    }
}
