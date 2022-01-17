package hw_7.scene_element.interfaces;

import hw_7.geometry.PointVector;

public interface SceneElement {
    String getName();
    void rotate(double phi);
    public PointVector getPosition();
    public void setPosition(PointVector pointVector);
}
