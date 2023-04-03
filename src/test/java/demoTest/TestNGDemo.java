package demoTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest() {
        User firstUser = new User("Jhon", 30);
        Assert.assertNotNull(firstUser);


    }


    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest() {
        Assert.assertTrue(true);
    }

    @DataProvider(name = "inputValues")
    public static Object[][]numbers(){
        return new Object[][]{
                {"jhon@gmail.com", "ValidPass"},
                {"jhon@gmail.com", "ValidPass"},
                {"jhon@gmail.com", "InvalidPass"}
        };
    }

    @Test(dataProvider = "inputValues")
    public void testLoginFun(String userName, String userPassword) {
        System.out.println(userName + " " + userPassword);
    }
}
