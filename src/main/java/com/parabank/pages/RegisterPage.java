package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By clickOnRegi = By.xpath("//a[contains(text(),'Register')]");
    By verifyRegi = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By enterFirstName = By.xpath("//input[@id='customer.firstName']");
    By enterLastName = By.xpath("//input[@id='customer.lastName']");
    By enterAddress = By.xpath("//input[@id='customer.address.street']");
    By enterCity = By.xpath("//input[@id='customer.address.city']");
    By enterState = By.xpath("//input[@id='customer.address.state']");
    By enterZipCode = By.xpath("//input[@id='customer.address.zipCode']");
    By enterPhone = By.xpath("//input[@id='customer.phoneNumber']");
    By enterSsn = By.xpath("//input[@id='customer.ssn']");
    By enterUserName = By.xpath("//input[@id='customer.username']");
    By enterPassWord = By.xpath("//input[@id='customer.password']");
    By enterConfirmPass = By.xpath("//input[@id='repeatedPassword']");
    By clickOnReg = By.xpath("//input[@value='Register']");
    By verifyAcc = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public void clickOnRegi(){
        clickOnElement(clickOnRegi);
    }
    public String verifyRegis(){
        return getTextFromElement(verifyRegi);
            }
            public void firstName(String name){
        sendTextToElement(enterFirstName,name);
            }
            public void lastName(String last){
        sendTextToElement(enterLastName,last);
            }
            public void address(String add){
        sendTextToElement(enterAddress,add);
            }
            public void city(String cit){
        sendTextToElement(enterCity,cit);
            }
            public void state(String stat){
        sendTextToElement(enterState,stat);
            }
            public void zipCode(String zip){
        sendTextToElement(enterZipCode,zip);
            }
            public void phone(String pho){
        sendTextToElement(enterPhone,pho);
            }
            public void ssn(String s){
        sendTextToElement(enterSsn,s);
            }
            public void userName(String name){
        sendTextToElement(enterUserName,name);
            }
            public void passWord(String pass){
        sendTextToElement(enterPassWord,pass);
            }
            public void confirmPass(String firm){
        sendTextToElement(enterConfirmPass,firm);
            }
            public void clickRe(){
        clickOnElement(clickOnReg);
            }
            public String verifyAc(){
        return getTextFromElement(verifyAcc);
            }




}
