package hw_7.scene_element.shape;

import hw_7.geometry.Edge;
import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.PolygonDerived;

import java.util.Arrays;

public class Polygon extends Shape implements PolygonDerived {//Immutable object
    private double radius;
    private PointVector[] vertexes;
    private Edge[] edges;
    public Polygon(String name, PointVector position, double angle, double radius, PointVector[] vertexes, Edge[] edges){
        super(name,position,angle);
        this.radius = radius;
        this.vertexes = Arrays.copyOf(vertexes, vertexes.length);
        this.edges = Arrays.copyOf(edges, edges.length);
    }
    public Polygon(String name){
        this(name,new PointVector(0.0,0.0), 0.0,1, new PointVector[0],new Edge[0]);
    }
    @Override
    public void vertexAdd(PointVector newVertex) {/*some magic*/}
    @Override
    public void vertexRemove(PointVector vertexToRemove) {/*some magic*/}
    @Override
    public void edgeAdd(Edge newEdge) {/*some magic*/}
    @Override
    public void edgeRemove(Edge edgeToRemove) {/*some magic*/}
    @Override
    public void setRadius(double radius){this.radius = radius;}
    @Override
    public String getName(){return "This polygon is " + super.getName();}
}
