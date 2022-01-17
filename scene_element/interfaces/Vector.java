package hw_7.scene_element.interfaces;

import hw_7.geometry.PointVector;

public interface Vector extends SceneElement{
    void setPosition(PointVector newPosition);
    void setRadius(double newRadius);
}
