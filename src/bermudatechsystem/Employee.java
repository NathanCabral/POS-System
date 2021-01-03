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
public class Employee extends Person 
{
    int empID; 
    String empUsername;
    int empSecurityLevel;
    String empPassword;
    
    
    public Employee(int pEmpID, String pEmpTitle, String pEmpName, String pEmpEmail, String pEmpPhoneNumber, String pEmpUserName,int pEmpSecurityLevel, String pEmpPassword)
    {
        super(pEmpTitle, pEmpName, pEmpEmail, pEmpPhoneNumber);
        empID = pEmpID;
        empUsername = pEmpUserName;
        empSecurityLevel = pEmpSecurityLevel;
        empPassword = pEmpPassword; 
    }
    public String getUserPassword()
    {
        return empPassword;
    }
    
    public String getUserUsername()
    {
        return empUsername;
    }
    
    public int getUserSecurityLevel()
    {
        return empSecurityLevel;
    }
    public int getEmployeeID()
    {
        return empID;
    }   
   
}
