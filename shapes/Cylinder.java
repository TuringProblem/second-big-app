package shapes;

import src.Volume;

public class Cylinder extends Circle implements Volume {

    private double height;

    Cylinder( double radius, String name, double height) {
        super(radius, name);
        this.height = height;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) {this.height = height;}
    @Override
    public double volume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }
}
