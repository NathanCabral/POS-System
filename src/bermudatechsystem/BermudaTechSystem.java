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
public class BermudaTechSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
      Database.companyDatabase.getDatabaseFile();
      LoginInterface nathan = new LoginInterface();
      nathan.setVisible(true);
    }
    
}
