package com.syntax.intellJ.class05;

public class Task1 {
    //create a method createEmail(), based on values of user name
    // lastName and email type, you method should return complete email address,
    //example, createEmail(john, Snow, gmail) -> Johnsnow@gmail.com

    String createEmail(String firstName,String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }


}
