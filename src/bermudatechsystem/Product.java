/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bermudatechsystem;
import java.util.ArrayList;
/**
 *
 * @author Nathan Cabral
 */
public class Product 
{
    String iProductID;
    String iHardwareType;
    String iInventoryProduct;
    int iProductPrice;
    int iProductQuantity;
    String iSupplierID;
    String itemTotal;
    public Product(String productID,String hardwareType, String inventoryProduct, int productPrice,int productQuantity, String supplierID)
    {
        iProductID = productID;
        iHardwareType = hardwareType;
        iInventoryProduct = inventoryProduct;
        iProductPrice = productPrice;
        iProductQuantity = productQuantity;
        iSupplierID = supplierID;
        
    }
    public Product(String pName,String pNumber,int pPrice,int pQuantity,String pTotal)
    {
         iInventoryProduct = pName;
         iProductID = pNumber;
         iProductPrice = pPrice;
         iProductQuantity = pQuantity;
         itemTotal = pTotal;

    }
    
    public String getItemTotal()
    {
        return itemTotal;
    }
    
    public String getProductName()
    {
        return iInventoryProduct;
    }
    
    public int getPrice()
    {
        return iProductPrice;
    }
    
    public int getQuantity()
    {
        return iProductQuantity;
    }
    
    public String getProductID()
    {
        return iProductID;
    }
    
    public String getHardwareType()
    {
        return iHardwareType;
    }
    
    public String getSupplier()
    {
        return iSupplierID;
    }
    
    public void minusQuantity(int amtRemove)
    {
        iProductQuantity = iProductQuantity - amtRemove;
    }
    
    public void addQuantity(int amtAdded)
    {
        iProductQuantity = iProductQuantity + amtAdded;
    }
}
