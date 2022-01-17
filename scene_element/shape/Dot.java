package hw_7.scene_element.shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.DotDerived;

public class Dot extends Shape implements DotDerived {
    public Dot(String name, PointVector position){
        super(name,position, 0.0);
    }
    public Dot(String name){this(name, new PointVector(0.0,0.0));}
    @Override
    public String getName(){
        return "This Dot is " + super.getName();
    }
    @Override
    public void setRadius(double newRadius){
        System.out.println("Ray have no radius, this will not affect this object");
        // пряма, промінь і точка - єдині винятки, на які не впливає довжина, розмір, чи радіус
    }
}
