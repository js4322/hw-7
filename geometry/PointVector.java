package hw_7.geometry;
import java.lang.Math;
/*
*Immutable object PointVector
* */
public class PointVector {
    private final double x;
    private final double y;
    public PointVector(double x, double y){
        this.x = x;
        this.y = y;
    }
    public PointVector(PointVector pointVector){ //copy constructor
        this(pointVector.x, pointVector.y);
    }
    public PointVector(){
        this(0.0,0.0);
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public PointVector add(PointVector p){
        return new PointVector(this.x+p.x, this.y + p.y);
    }
    public PointVector subtract(PointVector p){
        return new PointVector(this.x-p.x, this.y - p.y);
    }
    public double getLength(){
        return Math.hypot(x, y);
    }

    @Override
    public String toString() {
        return "PointVector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
