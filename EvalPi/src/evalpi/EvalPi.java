/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalpi;

/**
 *
 * @author danecek
 */
public class EvalPi {

    static double evalPi(int n) {
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            ...
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 1000;
        double pi = evalPi(n);

        System.out.printf("Estimated PI for %d is %f", n, pi);

    }

}
