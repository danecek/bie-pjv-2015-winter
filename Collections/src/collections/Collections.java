/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author danecek
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bag b = new Bag();
        System.out.println(b.size());
        b.add("xxx");
        System.out.println(b);
        b.add(23);
        System.out.println(b);
        b.remove("aaa");
        System.out.println(b);
        b.remove(23);
        System.out.println(b);
        b.clear();
        System.out.println(b);
        
    }
    
}
