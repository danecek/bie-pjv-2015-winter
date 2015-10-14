/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalpioo;

/**
 *
 * @author danecek
 */
public class EvalPIOO {

    static double evalPI(int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            MyPoint rp = MyPoint.createRandomPoint();
            if (rp.withinUnitCircle()) {
                k++;
            }

        }
        return 4. * k / n;
    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 4);
        System.out.println(p);
//        int n = 10000000;
//        double pi = evalPI(n);
//
//        System.out.printf("Estimated PI for %d is %f\n", n, pi);

    }

}
