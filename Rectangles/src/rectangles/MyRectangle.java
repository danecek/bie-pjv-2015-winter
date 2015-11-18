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
public class MyRectangle {

    private final MyPoint refPoint;

    public MyRectangle(MyPoint refPoint, int width, int height) {
        this.refPoint = refPoint;
        this.width = width;
        this.height = height;
    }

    public MyRectangle(MyPoint refPoint, MyPoint lowerRight) {
        this(refPoint, lowerRight.getX() - refPoint.getX(),
                lowerRight.getY() - refPoint.getY());
    }

    private final int width;
    private final int height;

    boolean contains(MyPoint point) {
        return refPoint.getX() < point.getX() && upperRight().getX() > point.getX()
                && lowerRight().getY() < point.getY() && lowerLeft().getY() > point.getY();

    }

    MyPoint upperRight() {
        return refPoint.move(width, 0);
    }

    MyPoint lowerRight() {
        return refPoint.move(width, height);
    }

    MyPoint lowerLeft() {
        return refPoint.move(0, height);
    }

    boolean cross(MyRectangle that) {
        return contains(that.refPoint)
                || contains(that.upperRight())
                || contains(that.lowerLeft())
                || contains(that.lowerRight());

    }

    public MyPoint getRefPoint() {
        return refPoint;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "{" + refPoint + "," + width + "," + height + '}';
    }

    MyRectangle union(MyRectangle that) {
        int minX = Math.min(refPoint.getX(), that.getRefPoint().getX());
        int minY = Math.min(refPoint.getY(), that.getRefPoint().getY());
        int maxX = Math.max(lowerRight().getX(), that.lowerRight().getX());
        int maxY = Math.max(lowerRight().getY(), that.lowerRight().getY());
        return new MyRectangle(new MyPoint(minX, minY), new MyPoint(maxX, maxY));
    }

}
