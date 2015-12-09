/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(10);
        new Consumer(cq).start();
        new Producer(cq).start();

    }
}
