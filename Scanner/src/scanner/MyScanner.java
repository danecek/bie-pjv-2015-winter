/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author danecek
 */
public class MyScanner {

    private char actChar;
    boolean eof = false;
    Reader r;

    public MyScanner(Reader r) throws IOException {
        this.r = r;
        nextChar();
    }

    private void nextChar() throws IOException {
        int c = r.read();
        if (c == -1) {
            eof = true;
            actChar = ' ';
        } else {
            actChar = (char) c;
        }
    }

    private TokenName getName() throws IOException {
        StringBuilder sb = new StringBuilder("" + actChar);
        nextChar();
        while (Character.isLetterOrDigit(actChar)) {
            sb.append(actChar);
            nextChar();
        }
        return new TokenName(sb.toString());

    }

    public Token nextToken() throws Exception {
        while (!eof()) {
            if (Character.isLetter(actChar)) {
                return getName();
            }
            if (Character.isDigit(actChar)) {
                return getNumber();
            }
            switch (actChar) {
                case ' ':
                    nextChar();
                    break;
                case '+':
                    nextChar();
                    return new Token(Tokens.PLUS);
                default: throw new Exception("unknown character " + actChar);

            }
        }
        return null;
    }

    boolean eof() {
        return eof;
    }

    private Token getNumber() throws IOException {

        int value = 0;
        while (Character.isDigit(actChar)) {
            value *=10;
            value += (actChar - '0');
            nextChar();
        }
        return new TokenNumber(value);
    }

}
