package hw_7.meta_shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.Raster;
import hw_7.scene_element.shape.*;
import hw_7.meta_shape.ShapePrinter;
public final class SetOfShapes {
    public static void main(String[] args) {
    Shape [] shapes = new Shape[10];
    shapes[0] = new Circle("my own circle");
    shapes[1] = new Circle("circle of my neighbor");
    shapes[2] = new Dot("my friend's dot");
    shapes[3] = new Ellipse("my own ellipse",new PointVector(10.7,34.1),10.2,2.0,44);
    shapes[4] = new Polygon("my neighbor's polygon");
    shapes[5] = new Ray("sun ray");
    shapes[6] = new RegularPentagon("unknown regular pentagon");
    shapes[7] = new RegularTrigon("my own triangle");
    shapes[8] = new RegularTrigon("a good triangle");
    shapes[9] = new RegularTrigon("an other triangle");
        for (Shape shape : shapes) {
            ShapePrinter.printShapeName(shape);
        }
    }

}
