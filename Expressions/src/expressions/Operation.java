/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

public enum Operation {

    PLUS("+"), MINUS("-"), MLT("*"), DIV("/");

    String chars;

    private Operation(String chars) {
        this.chars = chars;
    }

    @Override
    public String toString() {
        return chars;
    }

}
