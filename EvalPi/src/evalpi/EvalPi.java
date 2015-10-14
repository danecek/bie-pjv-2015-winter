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

    static double distanceFromOrigin(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    static double evalPi(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double dist = distanceFromOrigin(x, y);
            if (dist < 1) {
                k++;
            }
        }        
      //  return (double)k/n * 4;
           return 4.0 * k/n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 10000000;
        double pi = evalPi(n);

        System.out.printf("Estimated PI for %d is %f\n", n, pi);

    }

}
