package hw_7.scene_element.shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.DotDerived;

public class Circle extends Shape implements DotDerived {
    private double radius;
    public Circle(String name, PointVector position, double radius, double angle){
        super(name, position,angle);
        this.radius = radius;
    }
    public Circle(String name) {
        this(name, new PointVector(0.0,0.0), 1.0,0.0);
    }
    @Override
    public String getName(){
        return "This circle is " + super.getName();
    }
    @Override
    public void setRadius(double radius){
        this.radius = radius;
    }
}
