package hw_7.scene_element.interfaces;
import hw_7.geometry.PointVector;

public interface Raster extends SceneElement{
    void rescale(double percent);
    void setPosition(PointVector newPosition);
}
