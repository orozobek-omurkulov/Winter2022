package demoTest;

import com.digital.Calculator;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {


    SoftAssert softAssert = new SoftAssert();

    @Test
    public void addTwoNumsTest() {
      assertEquals(Calculator.add(2,2), 4);
    }


    @Test
    public void testSoftAssert() {
        softAssert.assertEquals(Calculator.add(2,2), 4);
//        System.out.println();
    }

    @Test
    public void test123() {
//        as
    }
}
