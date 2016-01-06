/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.util.Collection;

/**
 *
 * @author danecek
 */
public class DBTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PersonException {
        DAOPerson.INSTANCE.create("John");
        Collection<Person> persons = DAOPerson.INSTANCE.getAll();
        System.out.println(persons);

    }

}
