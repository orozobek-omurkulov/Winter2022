package demoTest;

import com.digital.Sprint2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sprint1 {

    @DataProvider(name = "isTrueData")
    public Object[][] provideData() {
        return new Object[][] {
                {new boolean[] {true, true, true, false}, 3},
                {new boolean[] {true, false, false}, 1},
        };
    }


    @Test(dataProvider = "isTrueData")
    public void testCount(boolean[] act, int expected) {
        int actualCount = Sprint2.countTrue(act);
        Assert.assertEquals(actualCount,expected );
    }


}
