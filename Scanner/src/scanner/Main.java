/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author danecek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {

        StringReader sr = new StringReader("aaa+123  \"thisisstring\" ");//aaa   33  xxx ; <<");
        MyScanner ms = new MyScanner(sr);
        while (!ms.eof()) {
            System.out.println(ms.nextToken());
        }

    }

}
