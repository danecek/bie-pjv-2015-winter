/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myset;

import java.util.Set;

/**
 *
 * @author danecek
 */
public class MySets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> mySet = new ImprovedMySet();
        System.out.println(mySet);
        mySet.add(33);
        System.out.println(mySet);
        mySet.add(22);
        System.out.println(mySet);
        mySet.add(33);
        System.out.println(mySet);
        mySet.remove(33);
        System.out.println(mySet);
        for (int i = 0; true; i++) {
            System.out.println(i);
            mySet.add(i);}
        // TODO code application logic here
    }

}
