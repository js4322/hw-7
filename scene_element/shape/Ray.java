package hw_7.scene_element.shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.DotDerived;

public class Ray extends Shape implements DotDerived {
    public Ray(String name, PointVector position, double angle){
        super(name, position, angle);
    }
    public Ray(String name){
        this(name, new PointVector(0.0, 0.0), 0.0);
    }
    @Override
    public String getName(){
        return "This ray is " + super.getName();
    }
    @Override
    public void setRadius(double radius){
        System.out.println("Ray have no radius, this will not affect this object");
        // пряма, промінь і точка - єдині винятки, на які не впливає довжина, розмір, чи радіус
    }
}
