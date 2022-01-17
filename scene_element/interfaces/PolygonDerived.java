package hw_7.scene_element.interfaces;

import hw_7.geometry.Edge;
import hw_7.geometry.PointVector;

public interface PolygonDerived extends Vector{
    public void vertexAdd(PointVector newVertex);
    public void vertexRemove(PointVector vertexToRemovew);
    public void edgeAdd(Edge newEdge);
    public void edgeRemove(Edge edgeToRemove);
}
