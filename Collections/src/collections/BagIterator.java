/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;

/**
 *
 * @author danecek
 */
public class BagIterator implements Iterator<Object> {

    private Bag bag;
    private int position;

    public BagIterator(Bag bag) {
        this.bag = bag;
    }

    @Override
    public boolean hasNext() {
        return position < bag.size();
    }

    @Override
    public Object next() {
        Object actualElement = bag.data[position];
        position++;
        return actualElement;
    }

}
