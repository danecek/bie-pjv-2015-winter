/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.Name;

/**
 *
 * @author danecek
 */
public class Storage {

    Map<Name, Customer> customers = new HashMap<>();

    String customerStorage = System.getProperty("user.home") + "/customerstorage.bin";

    static Storage instance = new Storage();

    public void store() throws IOException {
        store(customerStorage);
    }

    public void load() throws IOException {
        load(customerStorage);
    }

    public void store(String filePath) throws IOException {
        OutputStream fos = new FileOutputStream(filePath);
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(customers);
        }
    }

    public void load(String filePath) throws IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        try {
            customers = (Map<Name, Customer>) ois.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void put(Customer cust) {
        customers.put(cust.getName(), cust);
    }

    Collection<Customer> getAll() {
        return new ArrayList<Customer>(customers.values());

    }
}
