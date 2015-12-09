/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

public class Consumer extends Thread {
    CircularQueue cq;

    public Consumer(CircularQueue cq) {
        this.cq = cq;
    }

    @Override
    public void run() {
        while (!cq.isEmpty())
            System.out.println(cq.get());
    }
    
    
}
