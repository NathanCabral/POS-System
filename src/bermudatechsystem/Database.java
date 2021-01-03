/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bermudatechsystem;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nathan Cabral
 */
public class Database {
    public boolean Status = true;
    public static Database companyDatabase = new Database(); 
    File invFile = new File("tblInventory.csv");
    File cusFile = new File("tblCustomer.csv");
    File empFile = new File("tblEmployee.csv");
    File supFile = new File("tblSupplier.csv");
    File saleFile = new File("SalesLog.txt");
    File invoiceNumber = new File("InvoiceNumber.txt");
    PrintWriter outputWriter;
    public ArrayList<Product> products = new ArrayList<Product>();
    public ArrayList<Customer> customers = new ArrayList<Customer>();
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    public ArrayList<Supplier> suppliers = new ArrayList<Supplier>();    
    public ArrayList<String> updateProducts = new ArrayList<String>();
    public ArrayList<String> updateCustomers = new ArrayList<String>();
    public ArrayList<String> updateSuppliers= new ArrayList<String>();
    public ArrayList<String> updateEmployees = new ArrayList<String>();
    public ArrayList<String> salesLog = new ArrayList<String>();
    public ArrayList<Product> currentItems = new ArrayList<Product>();
    Scanner input = null;
    Scanner cust = null;
    Scanner emp = null;
    Scanner sup = null;
    Scanner sale = null;
    Scanner inv = null;
    DefaultTableModel modelCheckout;
    String errorMessage;
    String currentUsername;
    String currentUser;
    String datePurchased;
    String timePurchased;
    String newCustomerID;
    String newProductID;
    int newEmployeeID;
    int year;
    int month;
    int day;
    int hour;
    int second;
    int minute;
    int currentUserRights;
    double customerAmountPaid;
    double totalAmountDue;
    double totalChangeDue;
    int invNumber;
    
//public Database()
//{
//    getDatabaseFile();
//}
    
public void getDatabaseFile()
{
   try{
        input = new Scanner(new BufferedReader(new FileReader(invFile)));
        cust = new Scanner(new BufferedReader(new FileReader(cusFile)));
        emp = new Scanner(new BufferedReader(new FileReader(empFile)));
        sup = new Scanner(new BufferedReader(new FileReader(supFile)));
        sale = new Scanner(new BufferedReader(new FileReader(saleFile)));
        inv = new Scanner(new BufferedReader(new FileReader(invoiceNumber)));
   }
   catch(Exception noFileFound){
       Status = false;
   }
   if(Status != false) 
   {
        loadProductsArray();
        loadCustomerArray();
        loadEmployeeArray();
        loadSupplierArray();
        loadSalesLog();
        loadInvoiceNumber();
   }
   else
   {
     errorMessage = "Files Can Not Be Accessed";
     new ErrorMessage(errorMessage);
   }
   
}
public void loadProductsArray()
{
    String productID = "";
    String hardwareType = "";
    String inventoryProduct = "";
    String passVariable = "";
    int productPrice = 0;
    int productQuantity = 0;
    String supplierID = "";
    while(input.hasNextLine())
    {
         passVariable = input.nextLine();
        //If Statement used in case line does not have ','             
         if(passVariable.contains(","))
         {
            String[] details = passVariable.split(",");
            productID = details[0];
            hardwareType = details[1];
            inventoryProduct = details[2];
            productPrice = Integer.parseInt(details[3]);
            productQuantity = Integer.parseInt(details[4]);
            supplierID = details[5];  
         }
         else
         {
             errorMessage = "Error Splitting Variables in loadProductArray() ";
             new ErrorMessage(errorMessage);
         }
         
      products.add(new Product(productID, hardwareType, inventoryProduct, productPrice, productQuantity, supplierID));   
         
    }
    
}

private void loadCustomerArray()
{
    String customerID = "";
    String custTitle = "";
    String custName = "";
    String custEmail = "";
    String custAddress = "";
    String custPhoneNumber = "";
    String postalCode = "";
    String passVariable = "";
    
    while(cust.hasNextLine())
    {
        passVariable = cust.nextLine();
        
        if(passVariable.contains(","))
        {
            String[] custInformation = passVariable.split(",");
            customerID = custInformation[0];
            custTitle = custInformation[1];
            custName = custInformation[2];
            custEmail = custInformation[3];
            custAddress = custInformation[4];
            custPhoneNumber =custInformation[5];
            postalCode = custInformation[6];           
        }
        else 
        {
            errorMessage = "Error Splitting Variables in loadCustomerArray() ";
            new ErrorMessage(errorMessage);
        }
        
        customers.add(new Customer(customerID, custTitle, custName, custEmail, custAddress, custPhoneNumber, postalCode)); 
        
    }
}

public void loadEmployeeArray()
{
    int empID = 0;
    String empTitle = "";
    String empName = "";
    String empEmail = "";
    String empPhoneNumber = "";
    String empUserName = "";
    int empSecurityLevel = 0;
    String empPassword = "";
    String passVariable;
    
    while(emp.hasNextLine())
    {
        passVariable = emp.nextLine();
        
        if(passVariable.contains(","))
        {
            String[] empInformation = passVariable.split(",");
            empID = Integer.parseInt(empInformation[0]);
            empTitle = empInformation[1];
            empName = empInformation[2];
            empEmail = empInformation[3];
            empPhoneNumber = empInformation[4];
            empUserName = empInformation[5];
            empSecurityLevel = Integer.parseInt(empInformation[6]);
            empPassword = empInformation[7];
        }
        else 
        {
            errorMessage = "Error Splitting Variables in loadEmployeesArray() ";
            new ErrorMessage(errorMessage);
        }
        
         employees.add(new Employee(empID, empTitle, empName, empEmail, empPhoneNumber, empUserName, empSecurityLevel, empPassword));
    }
    
}
public void loadSupplierArray()
{
    String supID = ""; 
    String supName = "";
    String supRepresentativeName = "";
    String supRepresentativeNumber = "";
    String supRepresentativeEmail = "";
    String supSuppliedProduct = "";
    String passVariable;
    
    while(sup.hasNextLine())
    {
        passVariable = sup.nextLine();
        
        if (passVariable.contains(","))
        {
            String[] supInformation = passVariable.split(",");
            supID = supInformation[0];
            supName = supInformation[1];
            supRepresentativeName = supInformation[2];
            supRepresentativeNumber = supInformation[3];
            supRepresentativeEmail = supInformation[4];
            supSuppliedProduct = supInformation[5];
        }    
        else
        {
           errorMessage = "Error Splitting Variables in loadSuppliersArray() ";
           new ErrorMessage(errorMessage);
        }
        
        suppliers.add(new Supplier(supID, supName, supRepresentativeName, supRepresentativeNumber, supRepresentativeEmail, supSuppliedProduct));
    }
}
public void loadSalesLog()
{
    String currentSaleLine = "";
    while(sale.hasNextLine())
    {
        currentSaleLine = sale.nextLine();
        salesLog.add(currentSaleLine);
    }

}
public void loadInvoiceNumber()
{
    invNumber = inv.nextInt();
}
public void exportProductArray()
{
    
    try
        {
            File outputFile = invFile;
            outputWriter = new PrintWriter(outputFile);
            for (Product i: products)
            {
                String name = i.getProductName();
                String ID = i.getProductID();
                String hardwareType = i.getHardwareType();
                String supplier = i.getSupplier();
                int quantity = i.getQuantity();
                int price = i.getPrice();
                
                String outMessage = (ID + ","+ hardwareType+ ","+ name+ ","+ price+ ","+ quantity+ ","+ supplier);
                
                updateProducts.add(outMessage);
            }
            for(String s : updateProducts)
            {
                outputWriter.println(s);
            }
            outputWriter.close();
          
        }
        catch(Exception noFileFound)
        {
            errorMessage = "Error Exporting Information";
            new ErrorMessage(errorMessage);                    
        }
}
public void exportCustomersArray()
{
    
    try
        {
            File outputFile = cusFile;
           
            outputWriter = new PrintWriter(outputFile);
            for (Customer i: customers)
            {
                String name = i.getCustomerName();
                String ID = i.getCustomerID();
                String customerEmail = i.getCustomerEmail();
                String customerAddress  = i.getCustomerAddress();
                String customerNumber  = i.getCustomerNumber();
                String customerTitle = i.getCustomerTitle();
                String postalCode = i.getPostalCode();
                
                String outMessage = (ID + ","+ customerTitle+ ","+ name+ ","+ customerEmail+ ","+ customerAddress+ ","+ customerNumber+","+postalCode+",");
                
                
                updateCustomers.add(outMessage);
            }
            for(String s : updateCustomers)
            {
                outputWriter.println(s);
            }
            outputWriter.close();
          
        }
        catch(Exception noFileFound)
        {
            errorMessage = "Error Exporting Information";
            new ErrorMessage(errorMessage);                    
        }
}
public void exportEmployeesArray()
{
     try
        {
            File outputFile = empFile;
            
            outputWriter = new PrintWriter(outputFile);
            for (Employee i: employees)
            {
                String name = i.getName();
                int ID = i.getEmployeeID();
                String employeeEmail = i.getEmail();
                String employeePhoneNumber  = i.getPhoneNumber();
                String employeeUsername  = i.getUserUsername();
                int employeeUserSecurityLevel = i.getUserSecurityLevel();
                String employeePassword = i.getUserPassword();
                String employeeTitle = i.getTitle();
                
                
                
                String outMessage = (ID + ","+ employeeTitle+ ","+ name+ ","+ employeeEmail+ ","+ employeePhoneNumber+ ","+ employeeUsername+","+employeeUserSecurityLevel+","+employeePassword+",");
                
                
                updateEmployees.add(outMessage);
            }
            for(String s : updateEmployees)
            {
                outputWriter.println(s);
            }
            outputWriter.close();
          
        }
        catch(Exception noFileFound)
        {
            errorMessage = "Error Exporting Information";
            new ErrorMessage(errorMessage);                    
        }
}
public void exportSupplierArray()
{
    try
        {
            File outputFile = supFile;
            
            outputWriter = new PrintWriter(outputFile);
            for (Supplier i: suppliers)
            {
                String ID = i.getSupplierID();
                String name = i.getSupplierName();
                String supplierRepName = i.getRepresentativeName();
                String supplierRepNumber  = i.getRepresentativeNumber();
                String supplierRepEmail  = i.getRepresentativeEmail();
                String suppliedProduct = i.getSuppliedProduct();
                
                
                String outMessage = (ID + ","+ name+ ","+ supplierRepName+ ","+ supplierRepNumber+ ","+ supplierRepEmail+ ","+ suppliedProduct+",");
                
                
                updateSuppliers.add(outMessage);
            }
            for(String s : updateSuppliers)
            {
                outputWriter.println(s);
            }
            outputWriter.close();
          
        }
        catch(Exception noFileFound)
        {
            errorMessage = "Error Exporting Information";
            new ErrorMessage(errorMessage);                    
        }
}
public void exportSalesLog()
{
    try
    {
        File outputFile = saleFile;
        
        outputWriter = new PrintWriter(outputFile);
        for(String s: salesLog)
        {
            outputWriter.println(s);
        }
        outputWriter.close();
    }
    catch(Exception noFileFound)
    {
        errorMessage = "Error Exporting Information";
        new ErrorMessage(errorMessage);                    
    }
    
}
public void exportInvoiceNumber()
{
    try
    {
        File outputFile = invoiceNumber;
        outputWriter = new PrintWriter(outputFile);
        
        outputWriter.println(invNumber);
        outputWriter.close();
        
    }
    catch(Exception noFileFound)
    {
        errorMessage = "Error Exporting Information";
        new ErrorMessage(errorMessage);                    
    }
}
public void currentUser(String userName, int userRights)
{
    currentUsername = userName;
    currentUserRights = userRights;
    for(Employee i : employees)
    {
        if(currentUsername.equals(i.getUserUsername()))
        {
            currentUser = i.getName();
        }
    }
       
}
public int getCurrentUserRights()
{
    return currentUserRights;
}
public String getCurrentUser()
{
    return currentUser;
}

public void date()
{
       Calendar purchaseDate = new GregorianCalendar(); 
       year = purchaseDate.get(Calendar.YEAR);
       day = purchaseDate.get(Calendar.DAY_OF_MONTH);
       month = purchaseDate.get(Calendar.MONTH);
       
       datePurchased = (day + "/" + month + "/" + year);
}
 
public String getDate()
{
    return datePurchased;
}
      
public void time()
{
    Calendar purchaseTime = new GregorianCalendar();
    hour = purchaseTime.get(Calendar.HOUR_OF_DAY);
    minute = purchaseTime.get(Calendar.MINUTE);
    second = purchaseTime.get(Calendar.SECOND);

    timePurchased = (hour +":"+ minute + "." + second);
}
public String getTme()
{
    return timePurchased;
}

public void invoiceNumber()
{
    invNumber++;
}

public int getInvoiceNumber()
{
    return invNumber;
}
public void totalAmountPaid(Double amountPaid)
{
  customerAmountPaid = amountPaid;
}
public double getTotalAmountPaid()
{
  return customerAmountPaid;
}
public void totalAmountDue(double amountDue)
{
  totalAmountDue = amountDue;
}
public double getTotalAmountDue()
{
  return totalAmountDue;
}
public void changeDue(double changeDue)
{
   totalChangeDue = changeDue;
}
public double getChangeDue()
{
   return totalChangeDue;
}
public void clearCurrentItemsArray()
{
    currentItems.clear();
}

public void generateNewCustomerID()
{
    int customerArraySize = customers.size();
    String recentCustomerID = customers.get(customerArraySize-1).getCustomerID();
    String[] highestID = recentCustomerID.split("CST");
    
    int latestID = Integer.parseInt(highestID[1]);
    int updateCustomerID = latestID + 1;

     newCustomerID = ("CST" + updateCustomerID);
}
public void generateNewEmployeeID()
{
    int customerArraySize = employees.size();
    int recentEmployeeID = employees.get(customerArraySize - 1).getEmployeeID();
    newEmployeeID = recentEmployeeID + 1;
     
}
public String getNewCustomerID()
{
    return newCustomerID;
}
public int getNewEmployeeID()
{
    return newEmployeeID;
}
public void generateNewProductID()
{
    int productArraySize = products.size();
    String recentProductID = products.get(productArraySize - 1).getProductID();
    
    String[] highestID = recentProductID.split("PD");
    
    int latestID = Integer.parseInt(highestID[1]);
    int updateProductID = latestID + 1;

     newProductID = ("PD" + updateProductID);
}
public String getNewProductID()
{
    return newProductID;
}
public void saveSystem()
{
    exportProductArray();
    exportCustomersArray();
    exportSupplierArray();
    exportEmployeesArray();
    exportSalesLog();
    exportInvoiceNumber();
    System.exit(0);
}
    public String encrypt(String encryption)
    {
        char currentChar;
        int  aChar;
        int  addition;
        String encrypted = "";
        int count;

        addition = encryption.length();

        for(int x =0; x < addition ;x++ )
        {
            currentChar = encryption.charAt(x);
            aChar = currentChar + addition;
            aChar = aChar * (addition + (x+1));
            currentChar = (char)aChar;

            encrypted += currentChar;
        }

        return encrypted;
    }
}
    