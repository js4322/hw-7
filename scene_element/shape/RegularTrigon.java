package hw_7.scene_element.shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.DotDerived;

public class RegularTrigon extends Shape implements DotDerived {//triangle
    private double radius;
    public RegularTrigon(String name, PointVector centerPosition, double angle, double radius){
        super(name,centerPosition,angle);
        this.radius = radius;
    }
    public RegularTrigon(String name){
        this(name, new PointVector(0.0,0.0), 0.0, 1.0);
    }
    public PointVector[] getVertexes(){
        PointVector[] vertexes =new PointVector[3];
        //Some magic to get vertexes coordinates
        return vertexes;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    @Override
    public String getName(){
        return "This triangle is " + super.getName();
    }
}
