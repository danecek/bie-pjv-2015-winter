/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Address;
import model.Customer;
import model.Name;

/**
 *
 * @author danecek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Storage.instance.put(new Customer(new Name("Tom"), new Address("Prague")));
            Storage.instance.store();
            Storage.instance.put(new Customer(new Name("Bob"), new Address("Brno")));
            System.out.println(Storage.instance.getAll());
            Storage.instance.load();
            System.out.println(Storage.instance.getAll());
            
            // TODO code application logic here
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
