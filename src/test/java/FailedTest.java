import org.testng.Assert;
import org.testng.annotations.Test;


public class FailedTest {

    @Test(retryAnalyzer = CustomRetryAnalyzer.class)
    public void failedTest() {
        Assert.assertEquals(1,2);
    }
}
