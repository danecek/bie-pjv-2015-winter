/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class CircularQueue {

    int[] data;
    int head;
    int tail;
    int size;

    public CircularQueue(int capacity) {
        data = new int[capacity];
    }

    synchronized void put(int value) {
        while (isFull()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CircularQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        data[tail++] = value;
        if (tail == data.length) {
            tail = 0;
        }
        size++;
        notifyAll();
        System.out.println(Arrays.toString(Arrays.copyOf(data, size)));
    }

    synchronized boolean isFull() {
        return size == data.length;
    }

    synchronized boolean isEmpty() {
        return size == 0;
    }

    synchronized int get() {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(CircularQueue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int aux = data[head++];
        if (head == data.length) {
            head = 0;
        }
        size--;
        notifyAll();
        return aux;
    }

}
