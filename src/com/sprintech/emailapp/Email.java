package com.sprintech.emailapp;

import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor to receive firstname and lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);
    }

    //ask for department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Engineering\n3 for Accounting\n0 for none\nEnter Department Code:");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();     

        if(departmentChoice == 1){
            return "Sales";
        }else if(departmentChoice ==2){
            return "Engineering";
        }else if (departmentChoice == 3) {
            return "Accounting";
        }else{
            return "";
        }
    }

    //generate a random password


    //set the mail box capacity

    //set the alternate email

    //Change Password.
    
}
