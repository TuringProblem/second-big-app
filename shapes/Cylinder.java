package shapes;

import src.Volume;

public class Cylinder extends Circle implements Volume {
    private double height;
    public Cylinder() {
        super();
        height = 0.0;
    }
    public Cylinder(double radius, String name, double height) {
        super(radius, name);
        setHeight(height);
    }
    public double getHeight() { return height; }
    public void setHeight(double height) {this.height = height;}
    @Override
    public double volume() { return Math.PI * Math.pow(getRadius(), 2) * getHeight(); }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Height: %,5f", getHeight());
    }
}
