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
public class Name implements Serializable {
    String name;

    @Override
    public String toString() {
        return "Name{" + "name=" + name + '}';
    }

    public Name(String name) {
        this.name = name;
    }
}
