/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtest;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.EmbeddedDriver;

/**
 *
 * @author danecek
 */
public class DAOPerson {

    Connection conn;
    private final PreparedStatement createPs;
    private PreparedStatement getAllPs;

    public static final DAOPerson INSTANCE = new DAOPerson();
    private static final Logger LOG = Logger.getLogger(DAOPerson.class.getName());

    private DAOPerson() {
        try {
            new EmbeddedDriver();
            String url = "jdbc:derby:PersonDB;create=true";
            conn = DriverManager.getConnection(url);

            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, "PERSONS", null);
            if (!rs.next()) {
                LOG.info("CREATE TABLE PERSONS");
                Statement stm = conn.createStatement();
                stm.executeUpdate("CREATE TABLE PERSONS"
                        + "(ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,"
                        + "NAME  VARCHAR(50),"
                        + "PRIMARY KEY (ID))");

            }
            createPs = conn.prepareStatement("INSERT INTO PERSONS VALUES(DEFAULT, ?)");
            getAllPs = conn.prepareStatement("SELECT * FROM PERSONS");

        } catch (SQLException ex) {
            Logger.getLogger(DAOPerson.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }

    public void create(String name) throws PersonException {
        try {
            createPs.setString(1, name);
            createPs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOPerson.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersonException(ex);
        }

    }

    public Collection<Person> getAll() throws PersonException {
        try {
            ArrayList<Person> persons = new ArrayList<>();
            ResultSet rs = getAllPs.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Person p = new Person(id, name);
                persons.add(p);
            }
            return persons;
        } catch (SQLException ex) {
            Logger.getLogger(DAOPerson.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersonException(ex);
        }

    }

}
