package com.mycompany.chatapp1;

import java.util.Scanner;

public class Registration {
    //This stores the users registration data privately
    private String userName;
    private String userPassword;
    private String userCellPhoneNumber;
    
public Registration(String userName, String userPassword, String userCellphoneNumber){// This contructer modifies the user registration data
    
    /*Author:Data Camp
    Description: this keyboard in java
    URL:
    Source: Data Camp
    Date: 
    Date Accessed:April 03, 2026
    */
    
//It uses the this variable to assign the parameter value
        this.userName = userName;
        this.userPassword = userPassword;
        this.userCellPhoneNumber = userCellphoneNumber;
}

    public boolean check_forUserName(String userName){//This confirms the user name format
        Scanner inputObject = new Scanner(System.in); 
        
        this.userName = userName;//This stores the provided user name
        String nameOfTheUser = inputObject.nextLine();
        
        /*Author:StackOverflow
        Description: If(boolean condition) in Java
        URL:
        Source: StackOverflow
        Date:
        Date Accessed: April 03, 2026*/
        //It checks whether the user name contains an underscore, and the length is greater than 5
        if(userName.contains("_") && userName.length() <= 5){
            this.userName = userName;
            System.out.println("User Name is Successfully Captured! ");
            return true;

        }else{//If the username doesn't contains an underscore and the length is not greater than 5
            System.out.println("Your User Name Is Not Succefully Caption! Try Again! ");
            return false;
        }
    }
    public boolean check_forUserPassword (String userPassword){// This confirms whether the password has an upper case, a number number,a unique character and the length of the password is greater or equals to 8
        Scanner inputObject = new Scanner(System.in);
        do{
            
        this.userPassword = userPassword;//This stores the provided user name
        String password = inputObject.nextLine();
        /*Author:IONOS Editorial Team
        Description: How to use Java Booleans
        URL:https://www.ionos.com/digitalguide/websites/web-development/javas-boolean-primitive-data-type/
        Source: IONOS Digital Guide
        Date: January 03, 2025
        Date Accessed: 03, 2026
        */
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasUniqueCharacter = false;
        boolean passwordHasLength = userPassword.length()>=8;

        int i = 0;
        while(i < userPassword.length()){
            char a = userPassword.charAt(i);
            /*Author:StackOverflow
            Description: If(boolean condition) in Java
            URL:
            Source: StackOverflow
            Date Accessed:April 03,2026
            */
            /*Author: Sangeethamtech26
            Description: Conditional Statements in Java. Here we can discuss about if,if..else,if..elseif..else,switch and...
            URL:
            Date:
            Date Accessed:April 03, 2026
            */
            if(Character.isUpperCase(a)){//This checks if the password has an upper case
            hasUpperCase = true;
        }
            else if(Character.isDigit(a)){//This checks whether the password has a number
                hasNumber = true;
            }
            
            else if(Character.isLetterOrDigit(a)){//This checks whether the password has a unique character
                hasUniqueCharacter = true;
            }

            i++;
        }
        
        /*Author: Denis Belanger
        Description: Optimizing Nested || and && Conditions In Java: Best Practices
        URL:https://medium.com/@python-javascript-php-html-css/optimizing-nested-and-conditions-in-java-best-practices-ff4cb7de0dc8
        Source: Medium
        Date: November 30, 2024
        Date Accessed: April 03, 2026
        */
        if (hasUpperCase && hasNumber && hasUniqueCharacter && passwordHasLength){// This makes sure that the password has a upper case, a number, unique character and the password length is greater or equals to 8 should be true
            System.out.println("Password is Successfully Captured! ");
            return true;
        }
        else {//If the password doesn't include include a number, unique character, an upper case, and the password length is not greater or equals to 8
            System.out.println("Password is Captured Incorrectly! ");
            return false;
        }
        
      }
         while(userPassword.equalsIgnoreCase("Retry"));
        
        }
    
        /* Author:Baeldung
           Description: Validate Phone Numbers With Java Regex
           Source:Baeldung
           URL:https://www.baeldung.com/java-if-else
           Date Accessed: April 03, 2026
           Date: January 8, 2024
        */
    public boolean check_forCellPhoneNumber(String userCellPhoneNumber){// This confirms whether the as the south african code and it has 9 digits
        Scanner inputObject = new Scanner(System.in);

        this.userCellPhoneNumber = userCellPhoneNumber;//This stores the provided user cell phone number
        String phoneNumber = inputObject.nextLine();
        
        /*Author:StackOverflow
            Description: If(boolean condition) in Java
            URL:
            Source: StackOverflow
            Date Accessed:April 03,2026
            */
        if(phoneNumber.matches("^\\+27\\d{10}$")){//This makes sure if the user cell phone number has a south african code and has 9 digits
            System.out.println("Cell Phone Is Successfully Captured!");
            this.userCellPhoneNumber = phoneNumber;
            return true;
        }
        else{//If the user cell phone number doesn't include a south african cell phone code and 9 digits it will allow the user to retry to prompt their cell phone number again
            System.out.println("Your Cell Phone Is Captured Incorrectly");
            return false;
        }
    }
    /*Author:FreeCodeCamp
    Description: Getters and Setters in Java Explained
    URL:
    Date: January 25, 2020
    Date Accessed: April 03, 2026*/
    public String getcheck_CellPhoneNumber(){// This retrieves cell phone number using a getter method
        return userCellPhoneNumber;
    }
    /*Author:FreeCodeCamp
    Description:Getters and Setters in Java Explained
    URL:https://www.freecodecamp.org/news/java-getters-and-setters/
    Date: January 25, 2020
    Date Accessed: April 03, 2026*/
    public String getcheck_UserName(){// This retrieves user name using a getter method
        return userName;
    }
    /*Author: FreeCodeCamp
    Description: Getters and Setters in Java Explained
    URL:https://www.freecodecamp.org/news/java-getters-and-setters/
    Date: January 25, 2020
    Date Accessed: April 03,2026
    */
    
    public String getcheck_UserPassword(){// This retrieves the user password using a getter method
        return userPassword;
    }/*Author: FreeCodeCamp
    Description: Getters and Setters in Java Explained
    URL:https://www.freecodecamp.org/news/java-getters-and-setters/
    Date: January 25, 2020
    Date Accessed: April 03, 2026*/
    
    public void RegistrationDetails(){//This displays of all registrationdetails
        System.out.println("====== Registration========");
        //This shows all user registration information
        System.out.println("Enter Your User Name: ");
        System.out.println("Enter Your Password: ");
        System.out.println("Enter Your Cell Phone Number: ");

  } 
}
