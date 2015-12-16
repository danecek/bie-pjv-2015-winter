/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

/**
 *
 * @author danecek
 */
public class Velocity {

    private final double dx;
    private final double dy;

    public Velocity(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * @return the dx
     */
    public double getDx() {
        return dx;
    }

    /**
     * @return the dy
     */
    public double getDy() {
        return dy;
    }

    Velocity invertY() {
        return new Velocity(dx, -dy);
    }
}
