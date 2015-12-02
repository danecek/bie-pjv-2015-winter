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
public class TokenNumber extends Token {

    public TokenNumber(int value) {
        super(Tokens.NUMBER);
        this.value = value;
    }

    int value;

    @Override
    public String toString() {
        return "TokenNumber{" + "value=" + value + '}';
    }


}
