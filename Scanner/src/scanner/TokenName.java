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
public class TokenName extends Token {

    public TokenName(String nameString) {
        super(Tokens.NAME);
        this.nameString = nameString;
    }

    String nameString;

    @Override
    public String toString() {
        return "TokenName{" + "nameString=" + nameString + '}';
    }

}
