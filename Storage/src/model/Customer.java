/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author danecek
 */
public class Customer implements Serializable {

    private Name name;
    private Address address;

    public Customer(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{"+ name + ", " + address + '}';
    }

    @Override
    public boolean equals(Object that) {
        if (!(that instanceof Customer)) {
            return false;
        }
        return ((Customer) that).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
