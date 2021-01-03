/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bermudatechsystem;

/**
 *
 * @author Nathan Cabral
 */
public class Person {   
    String title;
    String name;
    String email;
    String phoneNumber;
    
    public Person(String pTitle, String pName, String pEmail, String pPhoneNumber)
    {
        title = pTitle;
        name = pName;
        email = pEmail;
        phoneNumber = pPhoneNumber;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public String getTitle()
    {
        return title;
    }
}
