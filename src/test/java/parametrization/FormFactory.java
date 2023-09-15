package parametrization;

import org.testng.annotations.Factory;

public class FormFactory {

    @Factory
    public Object[] fillFormData() {
        return new Object[] {
                new FactoryTest("FirstName1", "LastName1", "Male", "5937918311"),
                new FactoryTest( "FirstName2", "LastName2", "Female", "5937918312"),
                new FactoryTest( "FirstName3", "LastName3", "Other", "5937918313")
        };
    }
}
