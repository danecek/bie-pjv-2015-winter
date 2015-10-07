/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author danecek
 */
public class HelloWorld {
    
    

    static int sumNumbers(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        System.out.println("Sum number");
        int sum = sumNumbers(2, 3);
        
        System.out.println("Total sum is:"  +   sum);
        
        System.out.printf("Total sum is %d \n",  sum);
        
        
        

        // TODO code application logic here
    }

}
