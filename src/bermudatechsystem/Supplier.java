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
public class Supplier 
{
    String sSupID;
    String sSupName;
    String sSupRepresentativeName;
    String sSupRepresentativeNumber;
    String sSupRepresentativeEmail;
    String sSupSuppliedProduct;
    
    public Supplier(String supID, String supName, String supRepresentativeName, String supRepresentativeNumber, String supRepresentativeEmail, String supSuppliedProduct)
    {
        sSupID = supID;
        sSupName = supName;
        sSupRepresentativeName = supRepresentativeName;
        sSupRepresentativeNumber = supRepresentativeNumber;
        sSupRepresentativeEmail = supRepresentativeEmail;
        sSupSuppliedProduct = supSuppliedProduct;
    }
    public String getSupplierID()
    {
        return sSupID;
    }
    public String getSupplierName()
    {
        return sSupName;
    }
    public String getRepresentativeName()
    {
        return sSupRepresentativeName;
    }
    public String getRepresentativeNumber()
    {
        return sSupRepresentativeNumber;
    }
    public String getRepresentativeEmail()
    {
        return sSupRepresentativeEmail;
    }
    public String getSuppliedProduct()
    {
        return sSupSuppliedProduct;
    }
}
