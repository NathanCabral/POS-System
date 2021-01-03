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
public class Customer extends Person{
    String customerID; 
    String customerAddress;
    String postalCode;
    
   
    
     public Customer(String pCustomerID, String custTitle, String custName, String custEmail, String pCustomerAddress, String phoneNumber, String pPostalCode)
     {
         super(custTitle, custName, custEmail, phoneNumber);
         customerID = pCustomerID; 
         customerAddress = pCustomerAddress;
         postalCode = pPostalCode;

     }
     
     public String getCustomerName()
     {
         return super.getName();
     }
     
     public String getCustomerEmail()
     {
         return super.getEmail();
     }
     
     public String getCustomerNumber()
     {
         return super.getPhoneNumber();
     }
     
     public String getCustomerID()
     {
         return customerID;
     }     
     
     public String getPostalCode()
     {
         return postalCode;
     }
     
     public String getCustomerAddress()
     {
         return customerAddress;
     }
     public String getCustomerTitle()
     {
        return super.getTitle();
     }
}
