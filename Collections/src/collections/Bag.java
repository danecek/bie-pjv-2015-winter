/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author danecek
 */
public class Bag implements Collection {

    private Object[] data;
    private int size;

    public Bag(int maxSize) {
        data = new Object[maxSize];
    }

    public Bag() {
        this(1000);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        System.arraycopy(data, 0, a, 0, size);
        return a;
    }

    public boolean full() {
        return size == data.length;
    }

    @Override
    public boolean add(Object e) {
        if (full()) {
            throw new RuntimeException("bag is full");
        }
        data[size++] = e;
        return true;
    }

    private int find(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
//
//    @Override
//    public boolean remove(Object o) {
//        int pos = find(o);
//        if (pos == -1) {
//            return false;
//        }       
//        System.arraycopy(data, pos + 1, data, pos, size - pos - 1);
//        size--;
//        return true;
//    }
//    

    @Override
    public boolean remove(Object o) {
        int pos = find(o);
        if (pos == -1) {
            return false;
        }
        data[pos] = data[size - 1];
        data[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean changedFl = false;
        for (Object o : c) {
            changedFl |= add(o);
        }
        return changedFl;
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, size - 1, null);
        size = 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result = result + data[i] + ", ";
        }
        return result + "]";
    }

}
