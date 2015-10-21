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
public class MyPoint {

    private final int x;
    private final int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    MyPoint move(int dx, int dy) {
        return new MyPoint(x + dx, y + dy);
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + ']';
    }
}
