/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author danecek
 */
public class Token {

    @Override
    public String toString() {
        return "Token{" + "cls=" + cls + '}';
    }

    Tokens cls;

    public Token(Tokens cls) {
        this.cls = cls;
    }
}
