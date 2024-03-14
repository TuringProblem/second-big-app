package shapes;

import src.Area;

public class Circle extends Shape implements Area {
    private double radius;
    public Circle() {
        super();
        radius = 0;
    }
    public Circle(double radius, String name){
        super(name);
        setRadius(radius);
    }
    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }
    @Override
    public double area() { return Math.PI * Math.pow(getRadius(), 2); }
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Radius: %,5f\n", getRadius());
    }
}
