package shapes;

import src.Volume;

public class Sphere extends Circle implements Volume {

    public Sphere() { super(); }
    Sphere(double radius, String name){
        super(radius, name);
    }
    @Override
    public double volume() { return ((double) 4 / 3) * Math.PI * Math.pow(getRadius(), 3); }
}
