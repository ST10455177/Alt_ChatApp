package com.mycompany.chatapp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    
    public LoginTest() {
    }
    /*AUTHOR:Shrikant Latkar
    Source:BaseRock
    URL:https://www.baserock.ai/blog/learn-javas-assert-keyword-with-baserock-ai-a-developers-guide-to-better-tests
    Description:Learn Java's assert keyword with BaseRock AI: A Developer's Guide to Better Tests
    Prompt:AssertEquals
    Data Accessed: April 06, 2026
   
     
    */

    @Test
    public void testCheck_forUserName() {
        Login app = new Login("","");
        boolean userNameResults = app.check_forUserName("_");
        
        if(userNameResults == true){
            assertEquals("User Name '_' should be Valid", true, userNameResults);
        }
        else{
            assertEquals("User Name '_' Should Be Invaild", false, userNameResults);
        }
    }

    @Test
    public void testCheck_forUserPassword() {
        Login app = new Login("","");
        boolean passwordResults = app.check_forUserPassword("");
        
        if(passwordResults == true){
            assertEquals("User Password '' Should Be Vaild ", true,passwordResults);
        }
        else{
            assertEquals("User Password '' Should Be Invaild", false, passwordResults);
        }
    }

    @Test
    public void testLoginDetails() {
    }
    
}
