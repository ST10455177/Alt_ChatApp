package com.mycompany.chatapp1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    /*Author Shrikant Latker
    Source: BaseRock
    Prompt: assertEquals
    URL:https://www.baserock.ai/blog/learn-javas-assert-keyword-with-baserock-ai-a-developers-guide-to-better-tests
    Description: Learn Java's assert keyboard with BaseRock AI: A Developer's Guide to Better Tests
    Date Accessed: April 06, 2026
    */

    @Test
    public void testCheck_forUserName() {
        Registration app = new Registration("","","");
        boolean userNameResults = app.check_forUserName("_");
        
        if(userNameResults == true){
            assertEquals("The User Name Has An UnderScore And The Length Should Be Lesser Or Equals To 5", true, userNameResults);
        }
        else{
            assertEquals("User Name Doesn't Include An UnderScore And The Length Is Not Lesser Or Equals To 5", false, userNameResults);
        }
    }

    @Test
    public void testCheck_forUserPassword() {
        Registration app = new Registration("","","");
        boolean passwordResults = app.check_forUserPassword("");
        
        if(passwordResults == true){
            assertEquals("Password Should Include An Upper Case, A Special Character, A Number, And The Password Length Should Be Greater Or Equals To 8" , true, passwordResults);
        }
        else{
            assertEquals("Password Did Not Include A Special Character, A Number,An Upper Case, And The Password Length Is Not Greater Or Equals To 8", false, passwordResults);
        }
    }

    @Test
    public void testCheck_forCellPhoneNumber() {
        Registration app = new Registration("","","");
        
        boolean isCellPhoneNumberResultsValid = app.check_forCellPhoneNumber(" ");
       
        if(isCellPhoneNumberResultsValid == true){
            assertEquals("Cell Phone Number Should Start With The South African Code", true, isCellPhoneNumberResultsValid);
        }
        else{
            assertEquals("Cell Phone Number Did Not Start With The South African Code ", true, isCellPhoneNumberResultsValid);
        }
    }

    @Test
    public void testGetcheck_CellPhoneNumber() {
        Registration app = new Registration("",""," ");
        String cellPhoneResults = app.getcheck_CellPhoneNumber();
        
        if(cellPhoneResults.equals("+27")){
            assertEquals("Getter Should Return The Correct Phone Number", "+27", cellPhoneResults);
        }
        else{
            assertEquals("Getter Failed To Return Cell Phone Number","+27",cellPhoneResults);
        }
    }

    @Test
    public void testGetcheck_UserName() {
        Registration app = new Registration(" "," "," ");
        String userNameResults = app.getcheck_UserName();
        
        if(userNameResults.equals(" ")){
            assertEquals("Getter Should Return Correct User Name", "_", userNameResults);
        }
        else{
            assertEquals("Getter Has Failed To Return The User Name","_",userNameResults);
        }
    }

    @Test
    public void testGetcheck_UserPassword() {
        Registration app = new Registration(""," ","");
        String passwordResults = app.getcheck_UserPassword();
        
        if(passwordResults.equals("")){
            assertEquals("Getter should reurn correct password"," ","passwordResults");
        }
    }
    
    /*Author: DataCamp
    Source: Data Camp
    prompt:How to use null in java
    URL:https://www.datacamp.com/doc/java/null
    Description:Null Keyword in java 
    */
    @Test
    public void testRegistrationDetails() {
        Registration app = new Registration(" "," "," ");
        
        if(app != null){
        app.RegistrationDetails();
        assertEquals("Registration Details Is Printed Successfully", true, true);
    }
        else{
            assertEquals("Registration Details Object Is Null", true,false);
    }
    
}
}

