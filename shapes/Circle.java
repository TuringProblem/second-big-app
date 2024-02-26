package shapes;

import src.Area;

public class Circle extends Shape implements Area {
    private double r;

    Circle(double r, String name){
        super(name);
        this.r = r;
    }
    public void setRadius(double r) {
        this.r = r;
    }

    public double getRadius() {
        return r;
    }
    @Override
    public double getArea() {
       return Math.PI * Math.sqrt(getRadius());
    }
}
