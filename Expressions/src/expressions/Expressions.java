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
public class Expressions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Const c1 = new Const(1);
        Const c2 = new Const(2);
        BinOp plus = new BinOp(Operation.PLUS, c2, c1);
        BinOp mlt = new BinOp(Operation.MLT, plus, new Const(3));
        System.out.println(mlt.eval());
        System.out.println(mlt); // (2+1)*3

    }

}
