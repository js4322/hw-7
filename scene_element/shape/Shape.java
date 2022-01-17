package hw_7.scene_element.shape;

import hw_7.geometry.PointVector;
import hw_7.scene_element.interfaces.SceneElement;
public abstract class Shape implements SceneElement {
    private String name;
    private PointVector position;
    private double angle; //Для класу точка не буде сенсу кута, але написання цього поля тут позбавляє потреби писати у майже кожному нащадку метод ротейт
    public Shape(String name, PointVector position, double angle) {
        this.name = name;
        this.position = position;
        this.angle = angle;
    }
    public Shape(String name) {
        this(name, new PointVector(0,0), 0.0);
    }

    public String getName() {
        return name;
    }

    protected void setName(String Name){
        this.name = name;
    };
    @Override
    public void rotate(double angleToRotate){
        this.angle = (this.angle + angleToRotate) % 360;
    }
    @Override
    public PointVector getPosition(){
        return this.position;
    }
    @Override
    public void setPosition(PointVector position){
        this.position = position;
    }
}
