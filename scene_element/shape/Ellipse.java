package hw_7.scene_element.shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.DotDerived;

public class Ellipse extends Shape implements DotDerived {
    private double radius, radius2;
    public Ellipse(String name, PointVector position, double radius1, double radius2, double angle){
        super(name, position,angle);
        this.radius = radius1;
        this.radius2 = radius2;
    }
    public Ellipse(String name){
        this(name, new PointVector(0.0,0.0),1.0,2.1,0.0);
    }
    @Override
    public String getName(){
        return "This ellipse is " + super.getName();
    }
    @Override
    public void setRadius(double newRadius){
        double scaleFactor = this.radius >= this.radius2 ?
                newRadius / radius:
                newRadius / radius2;
        this.radius *= scaleFactor;
        this.radius2 *= scaleFactor;
    }
}
