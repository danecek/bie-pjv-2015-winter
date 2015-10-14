package evalpioo;

public class MyPoint {

    MyPoint(double xx, double y) {
        x = xx;
        this.y = y;
    }

    static MyPoint createRandomPoint() {
        MyPoint p = new MyPoint(Math.random(), Math.random());
        return p;
    }

    double x;
    double y;

    double distFromOrigin() {
        return Math.sqrt(this.x * x + y * y);
    }


    boolean withinUnitCircle() {
        return distFromOrigin() < 1;
    }
    
    public String toString() {
       return "[" + x + "," + y + "]"; 
    }
}
