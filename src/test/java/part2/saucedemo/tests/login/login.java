package part2.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.saucedemo.base.BaseTest;

public class login extends BaseTest {
    @Test
    public void testLoginErrorMessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz1234");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
