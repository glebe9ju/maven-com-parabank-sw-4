package com.parabank.testsuite;

import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;
import com.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        registerPage.clickOnRegi();
        String expectedReg = "Signing up is easy!";
        String actualReg = registerPage.verifyRegis();
        Assert.assertEquals(actualReg, expectedReg, "invalid message");
        registerPage.firstName("Ragi");
        registerPage.lastName("Tata");
        registerPage.address("787,BakeRoad");
        registerPage.city("Last");
        registerPage.state("Rati");
        registerPage.zipCode("UY6 7TY");
        registerPage.phone("01236547899");
        registerPage.ssn("456");
        registerPage.userName("ragi253@yahoo.com");
        registerPage.passWord("ragi123");
        registerPage.confirmPass("ragi123");
        registerPage.clickRe();
        String expectedAcc = "Your account was created successfully. You are now logged in.";
        String actualAcc = registerPage.verifyAc();
        Assert.assertEquals(actualAcc, expectedAcc, "invliad massage");
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.userName("ragi273@yahoo.com");
        loginPage.passWord("ragi123");
        loginPage.clickOnLo();
        String expectedAcc = "Accounts Overview";
        String actualAcc = loginPage.verifyAc();
        Assert.assertEquals(actualAcc, expectedAcc, "invalid message");
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.userName("ragi973@yahoo.com");
        loginPage.passWord("ragi123");
        loginPage.clickOnLo();
        String expectedLog = "The username and password could not be verified.";
        String actualLog = loginPage.verifyLoIn();
        Assert.assertEquals(actualLog, expectedLog, "invalid message");
    }

    @Test
    public void userShouldLogOutSuccessfully() {
        loginPage.userName("ragi273@yahoo.com");
        loginPage.passWord("ragi123");
        loginPage.clickOnLo();
        loginPage.logOut();
        String expectedCus = "Customer Login";
        String actualCus = loginPage.verifyCus();
        Assert.assertEquals(actualCus, expectedCus, "invalid messge");

    }
}
