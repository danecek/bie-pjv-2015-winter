/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

public enum Operation {

    PLUS("+", 0), MINUS("-", 0), MLT("*", 1), DIV("/", 1);

    private String chars;
    private int priority;

    private Operation(String chars, int priority) {
        this.chars = chars;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return getChars();
    }

    /**
     * @return the chars
     */
    public String getChars() {
        return chars;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

}
