/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**
 *
 * @author danecek
 */
public class Const extends Expression {

    public Const(int value) {
        this.value = value;
    }

    private final int value;

    @Override
    public int eval() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    @Override
    public int priority() {
        return Integer.MAX_VALUE;
    }

}
