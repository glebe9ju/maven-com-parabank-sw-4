package com.parabank.pages;

import com.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By enterUserName = By.xpath("//input[@name='username']");
    By enterpassWord = By.xpath("//input[@name='password']");
    By clickOnLog = By.xpath("//input[@value='Log In']");
    By verifyAcc = By.xpath("//h1[@class='title']");
    By verifyLogIn = By.xpath("//p[@class='error']");
    By verifyLogOut = By.xpath("//a[contains(text(),'Log Out')]");
    By logOutButton = By.xpath("//a[contains(text(),'Log Out')]");
    By verifyCustomerLogIn = By.xpath("//h2[contains(text(),'Customer Login')]");

    public void userName(String name){
        sendTextToElement(enterUserName,name);
    }
    public void passWord(String pass){
        sendTextToElement(enterpassWord,pass);
          }
          public void clickOnLo(){
        clickOnElement(clickOnLog);
          }
          public String verifyAc(){
        return getTextFromElement(verifyAcc);
          }
          public String verifyLoIn(){
        return getTextFromElement(verifyLogIn);
          }
          public void logOut(){
        clickOnElement(logOutButton);
          }
          public String verifyLoOu(){
        return getTextFromElement(verifyLogOut);
                  }
                  public String verifyCus(){
        return getTextFromElement(verifyCustomerLogIn);
                  }


}
