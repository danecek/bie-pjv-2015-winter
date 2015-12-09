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
public class Producer extends Thread {

    CircularQueue cq;

    public Producer(CircularQueue cq) {
        this.cq = cq;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            cq.put((int) (Math.random() * 100));
        }
    }

}
