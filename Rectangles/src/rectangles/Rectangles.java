/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

/**
 *
 * @author danecek
 */
public class Rectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyRectangle r1 = new MyRectangle(new MyPoint(0, 0), 10, 10);
        MyRectangle r2 = new MyRectangle(new MyPoint(1, 1), 10, 10);
        System.out.printf("%s crosses %s %b\n", r1, r2, r1.cross(r2));
        r1 = new MyRectangle(new MyPoint(20, 20), 10, 10);
        r2 = new MyRectangle(new MyPoint(1, 1), 10, 10);
        System.out.printf("%s crosses %s %b\n", r1, r2, r1.cross(r2));
        r1 = new MyRectangle(new MyPoint(0, 0), 2, 2);
        r2 = new MyRectangle(new MyPoint(2, 2), new MyPoint(10, 10));
        System.out.println(r1.union(r2));
    }

}
