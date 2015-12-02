/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author danecek
 */
public class Address implements Serializable {

    @Override
    public String toString() {
        return "Address{" + "address=" + address + '}';
    }

    public Address(String address) {
        this.address = address;
    }
    String address;
}
