package hw_7.scene_element.shape;

import hw_4.q22.Point;
import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.DotDerived;

public class RegularPentagon extends  Shape implements DotDerived {
    private double radius;
    public RegularPentagon(String name, PointVector centerPosition, double angle, double radius){
        super(name,centerPosition,angle);
        this.radius = radius;
    }
    public RegularPentagon(String name){
        this(name, new PointVector(0.0,0.0), 0.0, 1.0);
    }
    public PointVector[] getVertexes(){
        PointVector[] vertexes =new PointVector[5];
        //Some magic to get vertexes coordinates
        return vertexes;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    @Override
    public String getName(){
        return "This regular pentagon is " + super.getName();
    }
}
