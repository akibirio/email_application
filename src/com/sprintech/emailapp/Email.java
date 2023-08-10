package com.sprintech.emailapp;

import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String email;
    private String companySuffix = "sprintech.com";

    //constructor to receive firstname and lastname
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Department: "+ this.department);

        //call a method that returns a random password.
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your Password is: "+ password);

        //combone elements to generate email:
        email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + department.toLowerCase()+"."+ companySuffix;
        //System.out.println("Your Email is : "+ email);
        
    }

    //ask for department
    private String setDepartment(){
        System.out.println("New Employee: " + firstName + ". Department Codes:\n1 for Sales\n2 for Engineering\n3 for Accounting\n0 for none\nEnter Department Code:");
        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();     
         input.close();
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
    private String generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWZYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i=0; i<length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }


    //set the mail box capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternanteEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change Password.
    public void changePassword(String password){
        this.password = password;
    }
    

    public int getMailBoxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }


    public String showInfo(){
        return "DISPLAY NAME: "+ firstName + " " + lastName +
                "\nCOMPANY EMIAL: " + email + 
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
