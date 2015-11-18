/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myset;

import java.util.Arrays;

/**
 *
 * @author danecek
 */
public class ImprovedMySet extends MySet {

    @Override
    public boolean contains(Object o) {
        return find(o) >= 0;
    }

    @Override
    int find(Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        int pos = Arrays.binarySearch(data, 0, size, (Integer) o);
        if (pos >= 0 && pos < size) {
            return pos;
        }
        return -1;
    }
    
        @Override
    public boolean remove(Object o) {
        int pos = find(o);
        if (pos < 0) {
            return false;
        }
        System.arraycopy(data, pos + 1, data, pos, size - pos - 1);
        --size;
        return true;
    }


    @Override
    public boolean add(Integer e) {
        boolean b = super.add(e);
        Arrays.sort(data, 0, size);
        return b;

    }

}
