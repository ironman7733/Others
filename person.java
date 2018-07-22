package com.corejavapractice;

import java.util.Scanner;


import java.util.regex.Pattern;



public class Person 
{

    public enum Gender
    {
        
        M,F;
        
        // to check user input with enum values
        
        public boolean isMember(String gender)
        {
            Gender[] gendervalues = Gender.values();
            for(Gender genval : gendervalues)
                if(genval.equals(gender))
                    return true;
            		return false;
        }
    }
    
    String firstname;
    String lastname;
    Gender gender;
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
    // default constructor
    
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    Person()
    {
    	Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first name");
        String fname = input.next();
        

        System.out.println("Enter last name");
        String lname = input.next();

        System.out.println("Enter Gender");
        String gender = input.next();       // accept gender input from user as string
        Gender gdr = Gender.valueOf(gender);        // converting to enum type
        
        setFirstname(fname);
        setLastname(lname);     
        setGender(gdr);
        
    }
    Person(String fname,String lname,Gender gender)
    {
        setFirstname(fname);
        setLastname(lname);     
        setGender(gender);
    
    }
    public void mobileNumber()
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter mobile number");
        String mno=input1.next();
    
        System.out.println("First Name:" + " " + firstname);
        System.out.println("Last Name:" + " " + lastname);
        System.out.println("Gender:"+" "+getGender());
        
        if(Pattern.matches("[789][0-9]{9}", mno))
        {
            System.out.println("Mobile Number:"+" "+mno);
        }
        else
        {
            System.out.println("Enter 10 digit mobile number starting with 7/8/9");
        }
        

    }
    
    
    
}